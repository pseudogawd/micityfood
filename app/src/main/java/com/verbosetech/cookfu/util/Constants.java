package com.verbosetech.cookfu.util;

public class Constants {
    public static final String SERVER_API = "";
    public static final String LOGIN_API = "";
    // http://micityfood.com/admin/ajax?action=clientLogin&currentController=store&username=7003104562&password=7003104562
    public static final String GET_RESTURANT_DETAILS_BY_ID = "http://micityfood.com/mobileapp/api/MenuCategory?callback=jQuery1113028314006927994306_1536234365905&merchant_id=1&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365906";
    public static final String DETILS_BY_CATAGORY = "http://micityfood.com/mobileapp/api/getItemCount?callback=jQuery1113028314006927994306_1536234365905&cat_id=2&merchant_id=1&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365907";
    public static final String DETAIL_CATAGORY_AND_ITEM_ID = "http://micityfood.com/mobileapp/api/getItemDetails?callback=jQuery1113028314006927994306_1536234365905&item_id=3&merchant_id=1&cat_id=2&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365909";
    public static final String CAN_BE_USED_BY_PAGE_ID = "http://micityfood.com/mobileapp/api/getItem?callback=jQuery1113028314006927994306_1536234365905&&page=0&merchant_id=1&cat_id=2&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365908";
    public static final String DEVICE_DETAILS = "http://micityfood.com/mobileapp/api/getLanguageSettings?callback=jQuery1113028314006927994306_1536234365897&&client_token=null&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365898";
    public static final String GET_USER_LOCATION_BY_lAT_LON = "http://micityfood.com/mobileapp/api/reverseGeoCoding?callback=jQuery1113028314006927994306_1536234365897&lat=30.2025071&lng=74.9611755&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365900";
    //    public static final String GET_RESTURANTS_DETAILS_BY_ADDRESS = "http://micityfood.com/mobileapp/api/search?callback=jQuery1113028314006927994306_1536234365897&address=Model%20Town%20Rd,%20Model%20Town%20Phase%202,%20Model%20Town,%20Bathinda,%20Punjab%20151001,%20India&search_mode=address&page=0&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365902";
    public static final String GET_RESTURANTS_DETAILS_BY_ADDRESS = "http://micityfood.com/mobileapp/api/search?callback=jQuery1113028314006927994306_1536234365897&address=";
    public static final String CATGORY_COUNT_RESTAURANT_DETAIL_OF_FUNCATION = "http://micityfood.com/mobileapp/api/getCategoryCount?callback=jQuery1113028314006927994306_1536234365897&mtid=1&device_id=null&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365903";
    public static final String GETTING_RESTAURANT_CATEGORY = "http://micityfood.com/mobileapp/api/getCategory?callback=jQuery1113028314006927994306_1536234365897&&page=0&mtid=";
    //    public static final String GETTING_RESTAURANT_CATEGORY = "http://micityfood.com/mobileapp/api/getCategory?callback=jQuery1113028314006927994306_1536234365897&&page=0&mtid=";
    public static final String GETTING_MENU_CATGORY = "http://micityfood.com/mobileapp/api/MenuCategory?callback=jQuery1113028314006927994306_1536234365905&merchant_id=1&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365906";
    public static final String GETTING_ITEMS_COUNT_IN_MENU = "http://micityfood.com/mobileapp/api/getItemCount?callback=jQuery1113028314006927994306_1536234365905&cat_id=2&merchant_id=1&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365907";
    public static final String GET_ITEM = "http://micityfood.com/mobileapp/api/getItem?callback=jQuery1113028314006927994306_1536234365905&&page=0&merchant_id=";
    public static final String GET_ITEM_DETAIL = "http://micityfood.com/mobileapp/api/getItemDetails?callback=jQuery1113028314006927994306_1536234365905&item_id=3&merchant_id=1&cat_id=2&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365909";
    public static final String GET_LOAD_CART = "http://micityfood.com/mobileapp/api/loadCart?callback=jQuery1113028314006927994306_1536234365905&merchant_id=1&search_address=Model%20Town%20Rd%2C%20Model%20Town%20Phase%202%2C%20Model%20Town%2C%20Bathinda%2C%20Punjab%20151001%2C%20India&cart=[{%22item_id%22:%223%22,%22qty%22:%222%22,%22price%22:%22120|Full%20Plate%22,%22sub_item%22:[],%22cooking_ref%22:[],%22ingredients%22:[],%22order_notes%22:%22%22,%22discount%22:%22%22,%22category_id%22:%222%22}]&transaction_type=delivery&device_id=null&tips_percentage=0&remove_tips=&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365910";
    public static final String CHECKOUT_PAGE = "http://micityfood.com/mobileapp/api/checkout?callback=jQuery1113028314006927994306_1536234365905&merchant_id=1&search_address=Model%20Town%20Rd%2C%20Model%20Town%20Phase%202%2C%20Model%20Town%2C%20Bathinda%2C%20Punjab%20151001%2C%20India&transaction_type=delivery&delivery_date=2018-09-06&delivery_asap=1&client_token=null&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365911";
    public static final String GET_CUSTOM_FILEDS = "http://micityfood.com/mobileapp/api/getCustomFields?callback=jQuery1113028314006927994306_1536234365905&&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365912";
    public static final String GET_PAYMENT_OPTION = "http://micityfood.com/mobileapp/api/getPaymentOptions?callback=jQuery1113028314006927994306_1536234365905&merchant_id=1&street=Model%20Town%20Road&city=Punjab&state=Punjab&zipcode=151001&location_name=&save_address=undefined&transaction_type=delivery&client_token=rszuzj6sw29pypz903f00c40224a46e460c2a201740943e&contact_phone=+919548170000&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365914";
    public static final String PLACE_ORDER = "http://micityfood.com/mobileapp/api/placeOrder?callback=jQuery1113028314006927994306_1536234365905&merchant_id=1&cart=%5B%7B%22item_id%22%3A%223%22%2C%22qty%22%3A%222%22%2C%22price%22%3A%22120%7CFull%20Plate%22%2C%22sub_item%22%3A%5B%5D%2C%22cooking_ref%22%3A%5B%5D%2C%22ingredients%22%3A%5B%5D%2C%22order_notes%22%3A%22%22%2C%22discount%22%3A%22%22%2C%22category_id%22%3A%222%22%7D%5D&transaction_type=delivery&delivery_date=2018-09-06&delivery_asap=1&formatted_address=Model%20Town%20Rd,%20Model%20Town%20Phase%202,%20Model%20Town,%20Bathinda,%20Punjab%20151001,%20India&google_lat=&google_lng=&next_step=payment_option&street=Model+Town+Road&city=Punjab&state=Punjab&zipcode=151001&formatted_address=Model+Town+Rd%2C+Model+Town+Phase+2%2C+Model+Town%2C+Bathinda%2C+Punjab+151001%2C+India&google_lat=&google_lng=&contact_phone=%2B919548170000&location_name=&delivery_instruction=&client_token=rszuzj6sw29pypz903f00c40224a46e460c2a201740943e&search_address=Model%20Town%20Rd%2C%20Model%20Town%20Phase%202%2C%20Model%20Town%2C%20Bathinda%2C%20Punjab%20151001%2C%20India&earned_points=null&device_id=null&paypal_flag=2&paypal_mode=&client_id_sandbox=&client_id_live=&client_id=&paypal_card_fee=&voucher_amount=&voucher_type=&pts_redeem_points=&pts_redeem_amount=&cod_change_required=&payment_list=cod&order_change=&voucher_code=&redeem_points=&tips_percentage=0&lang_id=en&lang=en&api_key=0313dfad2d6c8675839f38c8009a40a1&app_version=2.5&_=1536234365915";
}