package se.swedsoft.bookkeeping.gui.util.filechooser.util;


import se.swedsoft.bookkeeping.gui.util.SSBundle;

import java.util.ResourceBundle;


/**
 * Date: 2006-feb-13
 * Time: 14:48:14
 */
public class SSFilterTXT extends SSFileFilter {

    public static ResourceBundle bundle = SSBundle.getBundle();

    public SSFilterTXT() {
        addExtension("txt");
    }

    /**
     * @return The description of this filter
     */
    @Override
    public String getDescription() {
        return SSFilterTXT.bundle.getString("filechooser.txt.filter");
    }

}
