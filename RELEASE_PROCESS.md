# Release process
This document describe the steps to evolve and release the modules in this is porject.

1. For stating with a new set of changes:
    1. Make sure you are making new change against a SNAPSHOT version of  module XXXX.
    2. Add an entry to CHANGELOG.md, see guidlenes [here](https://github.com/olivierlacan/keep-a-changelog/blob/master/CHANGELOG.md).

2. You can deploy the SNAPSHOT version locally as you test the changes:
    > gradlew -p XXXX publishToMavenLocal
    
    or globally:
    > gradlew -p XXXX publishAllPublicationToMavenRepository

3. When preparing to do an official release:
    1. Remove SHANPSHOT from the version
    2. Make a local deployment to test with:
        > gradlew -p XXXX publishToMavenLocal
    3. Finish the release notes in CHANGELOG.md
    4. Create tag in Git and push the changes.
    5. Publish the release to Maven Central:
        > gradlew -p XXXX publishAllPublicationToMavenRepository
    6. Bump up the version and append SNAPSHOT again.
    7. Start new entry in CHANGELOG.md