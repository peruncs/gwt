//This script is included into and shared by all modules
//------------------------------------------------------


//Shared properties
ext {
    // Compilers
    java_lang_level='1.8'

    // Software packages
    gwt_elemental2_version='2.26'
    gwt_base_version='1.0.0-b2-e6d791f'
    gwt_jsinterop_version='1.0.2-p1'


    gwt_uikit_version='0.0.6'
    gwt_recaptcha_version='0.0.6'

    gwt_stripe_version='0.0.6'
    gwt_utils_version='0.0.6'
    gwt_jwt_version='0.0.6'
    gwt_cookies_version='0.0.6'
    gwt_tabulator_version='0.0.6'
}

apply plugin: 'java'
apply plugin: 'maven-publish'


//Shared dependencies
dependencies {

    //Newer, alternative Elemental2/Jsinterop, Provided by Peter Donald.
    //compileOnly "org.realityforge.com.google.jsinterop:base:${gwt_base_version}"
    compileOnly "org.realityforge.com.google.elemental2:elemental2-core:${gwt_elemental2_version}"
    compileOnly "org.realityforge.com.google.elemental2:elemental2-dom:${gwt_elemental2_version}"
    compileOnly "org.realityforge.com.google.elemental2:elemental2-webstorage:${gwt_elemental2_version}"

}

def dependencyOverrides = { DependencyResolveDetails details ->
    //Override elemental2 and jsinterop
    if (details.requested.module.group == 'com.google.jsinterop' && details.requested.module.name == 'jsinterop'){
        details.useTarget group: 'org.realityforge.com.google.jsinterop', name: 'jsinterop', version: gwt_jsinterop_version
    }else if (details.requested.module.group == 'com.google.jsinterop' && details.requested.module.name == 'jsinterop-annotations'){
        details.useTarget group: 'org.realityforge.com.google.jsinterop', name: 'jsinterop-annotations', version: gwt_jsinterop_version
    }else if (details.requested.module.group == 'com.google.jsinterop' && details.requested.module.name == 'base'){
        details.useTarget group: 'org.realityforge.com.google.jsinterop', name: 'base', version: gwt_base_version
    }else if (details.requested.module.group == 'com.google.elemental2' ){
        details.useTarget group: 'org.realityforge.com.google.elemental2', name: details.requested.name, version: gwt_elemental2_version
    }
}
configurations.all {
    resolutionStrategy {
        eachDependency(dependencyOverrides)
    }
}

tasks.withType(JavaCompile) {
    options.incremental = true
}

compileJava {
    options.compilerArgs << "-Xlint:unchecked" << "-Xlint:deprecation" << "-Xlint:deprecation"
}

sourceCompatibility = "${java_lang_level}"
targetCompatibility = "${java_lang_level}"

repositories {
    mavenCentral()
    mavenLocal()
}

javadoc {
    if (JavaVersion.current().isJava9Compatible()) {
        options.addBooleanOption('html4', true)
    }
    failOnError false
}

task sourcesJar(type: Jar) {
    from sourceSets.main.allJava
    archiveClassifier = 'sources'
}

task javadocJar(type: Jar) {
    from javadoc
    archiveClassifier = 'javadoc'
}

//Include sources and some manifest attributes into the default jar
jar {
    manifest {
        attributes(
                'Build-Timestamp': java.time.Instant.now().toString(),
                'Specification-Vendor': 'peruncs.com',
                'Implementation-Vendor': 'peruncs.com',
                'Build-Jdk': "${System.properties['java.version']} (${System.properties['java.vendor']} ${System.properties['java.vm.version']})",
                'Build-With': "Gradle ${gradle.gradleVersion}",
        )
    }
    from sourceSets.main.allSource
}

publishing {
    afterEvaluate {
        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/peruncs/gwt")
                credentials {
                    username githubUser
                    password githubToken
                }
            }
        }
    }
}