package com.medicmedia.medilink.models;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class searchModel {
    private static List<String> stores;

    static {
        ArrayList arrayList = new ArrayList();
        stores = arrayList;
        arrayList.add("Amazon");
        stores.add("Sears");
        stores.add("Ebay Home");
        stores.add("Macys Home");
        stores.add("JCpenney Kids");
        stores.add("Ebay Electronics");
        stores.add("Amazon Appliance");
        stores.add("Ebay Mobiles");
        stores.add("Ebay Kids");
        stores.add("Amazon Fashion");
        stores.add("Ebay Travel");
        stores.add("JCpenney Home");
        stores.add("JCpenney Luggage");
        stores.add("JCpenney Appliance");
        stores.add("JCpenney Fashion");
        stores.add("Amazon Luggage");
        stores.add("Macys Jewellery");
        stores.add("JCpenney Jewellery");
        stores.add("Amazon Jewellery");
    }

    public static List<String> getStores() {
        return stores;
    }

    public static List<String> filterData(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (String str2 : stores) {
                if (str2.toLowerCase().contains(lowerCase)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }
}
