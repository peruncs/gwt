package com.peruncs.gwt.uikit;

/**
 * Shared events.
 */
public interface Events {
    /**
     * Fires before an item is shown.
     */
    String BEFORE_SHOW_EVENT = "beforeshow";

    /**
     * Fires after an item is shown.
     */
    String SHOW_EVENT = "show";

    /**
     * Fires after the item's show animation has completed.
     */
    String SHOWN_EVENT = "shown";

    /**
     * Fires before an item is hidden.
     */
    String BEFORE_HIDE = "beforehide";

    /**
     * Fires after an item's hide animation has started.
     */
    String HIDE_EVENT = "hide";

    /**
     * Fires after an item is hidden.
     */
    String HIDDEN_EVENT = "hidden";


    /**
     * Fires when an item loads.
     */
    String ITEM_LOAD = "itemload";

    /**
     * Fires before an item is shown.
     */
    String BEFORE_ITEM_SHOW = "beforeitemshow";

    /**
     * Fires after an item is shown.
     */
    String ITEM_SHOW = "itemshow";

    /**
     * Fires after an item's show animation has completed.
     */

    String ITEM_SHOWN = "itemshown";


    /**
     * Fires before an item is hidden.
     */
    String beforeitemhide = "BEFORE_ITEM_HIDE";

    /**
     * Fires after an item's hide animation has started.
     */
    String ITEM_HIDE = "itemhide";


    /**
     * Fires after an item's hide animation has completed.
     */
    String ITEM_HIDDEN = "itemhidden";

    /**
     * Fires when the drop-stackclass is applied.
     */
    String DROP_STACK_EVENT = "stack";

    /**
     * Fires after an item moves into the viewport.
     */
    String ITEM_INVIEW = "inview";

    /**
     * Fires after an item moves into out of viewport.
     */
    String ITEM_OUTVIEW = "outview";

    /**
     * Fires after an item becomes active.
     */
    String ACTIVE = "active";

}
