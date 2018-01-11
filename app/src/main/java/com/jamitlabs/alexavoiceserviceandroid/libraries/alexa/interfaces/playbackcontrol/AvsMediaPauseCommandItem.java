package com.jamitlabs.alexavoiceserviceandroid.libraries.alexa.interfaces.playbackcontrol;

import com.jamitlabs.alexavoiceserviceandroid.libraries.alexa.data.Directive;
import com.jamitlabs.alexavoiceserviceandroid.libraries.alexa.interfaces.AvsItem;

/**
 * {@link Directive} to send a pause command to any app playing media
 *
 * This directive doesn't seem applicable to mobile applications
 *
 * @author will on 5/31/2016.
 */

public class AvsMediaPauseCommandItem extends AvsItem {
    public AvsMediaPauseCommandItem(String token) {
        super(token);
    }
}