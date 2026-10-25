package com.medicmedia.medilink;

import android.util.Base64;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MLConst {
    public static int CONNECT_MODE = 2;
    public static int IS_DEBUG_MODE;
    public static final Map<String, String> MARKER_COLOR_MAP;
    public static final String[] colorcode;
    public static final String[] WEB_MARKER_COLOR_CODE_LIST = {"ffff00", "7fff00", "ff0000", "00bfff"};
    public static String BUNDLE_MEDIA_ITEMS = "MEDIA_ITEMS";

    public static class AppInfo {
        public static final int DEBUG = 1;
    }

    public static class BaristaAuth {
        private static final String BARISTA_CLIENT = "medilink-app-client";
        private static final String BARISTA_PROD_DOMAIN = "https://login.medilink-study.com";
        public static final int BARISTA_REFRESH_TOKEN_EXPIER = 180;
        private static final String BARISTA_STG_DOMAIN = "https://login.stg-medilink.com";
        private static final String BARISUTA_GETTOKEN = MLConst.getBaristaUrl() + "/oauth/token";
        private static final String BARISUTA_SECRET = MLConst.getBaristaSecret();
    }

    public static class BookshelfItemPop {
        public static final int COMPLETE_SUCCESS = 8;
        public static final int FULL_COMPLETE_SUCCESS = 9;
        public static final int GENE_MENU_ERROR = 102;
        public static final int GENE_MENU_SUCCESS = 7;
        public static final int GENE_READITEM_ERROR = 101;
        public static final int GENE_READITEM_SUCCESS = 4;
        public static final int NOT_DOWNLOAD = 0;
        public static final int SUCCESS_DOWNLOAD = 1;
        public static final int ZIP_UNPACK_ERROR = 100;
        public static final int ZIP_UNPACK_SUCCESS = 3;
    }

    public static class EvernoteSettings {
        public static final int SAVE_DATA_BOOKMARK = 1;
        public static final int SAVE_DATA_MARKER = 2;
        public static final int SAVE_DATA_MEMO = 0;
    }

    public static class HistorySort_Write {
        public static final int VIEW_SORT_ASC = 0;
        public static final int VIEW_SORT_DSEC = 1;
        public static final int WRITE_SORT_ASC = 2;
        public static final int WRITE_SORT_DSEC = 3;
    }

    public static class Jsons_Tag {
        public static final String IS_ONLINE = "is_online";
    }

    public static class MLBottomsSheet {
        public static final int MAX_WIDTH = 1440;
    }

    public static class MLCommon {
        public static final int ANIMATION_TIME = 500;
        public static final String CARD_DATE_FORMAT = "yyyy年MM月dd日 HH:mm";
        public static final String COMMA = ",";
        public static final String CONNECTION_RECEIVER = "android.net.conn.CONNECTIVITY_CHANGE";
        public static final String FILE_FORMAT = "file://";
        public static final String HTTPS_FORMAT = "https://";
        public static final String HTTPS_FORMAT_STRING = "https";
        public static final String HTTP_FORMAT = "http://";
        public static final String HTTP_FORMAT_STRING = "http";
        public static final String INIT_TEXT = "";
        public static final String ISO_8859_1 = "iso-8859-1";
        public static final String LOCAL_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
        public static final String MAILTO_FORMAT_STRING = "mailto";
        public static final float ML_DEFAULT_HEADER_SIZE = 48.0f;
        public static final String MOVIE_ENABLE_DATE_FORMAT = "yyyy年MM月dd日";
        public static final String MOVIE_ENABLE_DATE_MAX = "2200年01月01日";
        public static final String PDF = ".pdf";
        public static final int SEARCH_GOOGLE = 1;
        public static final int SEARCH_IN_APP = 0;
        public static final String SEPALETER_SINGLE_TEXT = "_";
        public static final String SEPALETER_TEXT = "__";
        public static final String SHARP = "#";
        public static final String SUB_DATE_FORMAT = "yyyy/MM/dd";
        public static final String VOLLEY_BODY_CONTENT_TYPE = "application/x-www-form-urlencoded; charset=UTF-8";
        public static final String string_option = ".*";
    }

    public static class MLCommonTAG {
        public static final String SEARCH_VIEW_ALL_TAB_FILTER = "searchViewTextFilterAllTab";
        public static final String SEARCH_VIEW_FILTER = "searchViewTextFilter";
        public static final String SEARCH_VIEW_FORCUS = "searchViewForcus";
        public static final String SEARCH_VIEW_TAB_POSITION = "searchViewTextFilterTabPosition";
        public static final String SEARCH_VIEW_TEXT = "searchViewText";
        public static final String TMP_CONTENTS_FILTER = "tmpContentsFilter";
    }

    public static class MLEditBookshelf {
        public static final int ALL_DOWNLOAD = 3;
        public static final int ALL_MOVIE_DOWNLOAD = 9;
        public static final int DISPLAY = 2;
        public static final int FILE_DELETE = 0;
        public static final int MOVIE_DOWNLOAD = 4;
        public static final int SCAN_CONTENTS = 8;
        public static final int SORT = 1;
    }

    public static class MLFirebaseSetting {
        public static final String BOOK_EXTRAS = "UsersBookExpansionData";
        public static final String BROWSING_HISTORIES = "browsing_histories";
        public static final long CACHE_EXPIRATION = 0;
        public static final String ENABLE_DASHBOARD_KEY = "is_dashboard_fab_enable";
        public static final int HISTORY_SIZE = 1000;
        public static final int HISTORY_SIZE_MYPAGE = 5;
        public static final boolean IS_REALM_ENABLE = false;
        public static final String MOVIE_DATAS = "movie_complate_datas";
        public static final int SEARCH_DISP_HISTORY_SIZE = 20;
        public static final String USERS_DATAS = "UsersDatas";
        public static final String USERS_HISTORY = "UsersHistory";
        public static final String USERS_MOVIE_HISTORY = "UsersMovieHistory";
        public static final String USERS_WRITE_HISTORY = "UsersWriteHistory";
        public static final String WRITE_HISTORIES = "write_histories";
        public static final String WRITE_HISTORY_DATAS = "write_history_datas";
    }

    public static class MLFragmentTag {
        public static final String DEVICE_DIALOG = "device_fragment_dialog";
        public static final String TOC_FRAGMENT = "TOC_FRAGMENT";
        public static final String VIEWER_STACK = "ContentsViewerBackStack";
    }

    public static class MLRequestCode {
        public static final int VIEWER_MODE = 1001;
    }

    public static class MLResultCode {
        public static final int GO_TO_HOME = 9001;
    }

    public static class MLReviewModeUi {
        public static final int CENTER = 1;
        public static final int LEFT = 0;
        public static final int RIGHT = 2;
        public static final int UNDISPLAY = 4;
    }

    public static class MLVideoCommon {
        public static final int DOWNLOAD_ENABLE = 1;
        public static final int DOWNLOAD_LIMIT = 14;
        public static final String GET_TEXT_FROM_WEBVIEW = "(function(){return window.getSelection().toString()})()";
        public static final boolean IS_SHARE = false;
        public static final int MAX_COPY_LENGTH = 500;
        public static final int MOVIE_ANIMATION = 500;
        public static final int MOVIE_ANIMATION_END_DELAY = 300;
        public static final int USER_NOT_PURCHASE = 0;
        public static SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.JAPAN);
        public static String QB_MOVIE = MLConst.getQBUrl() + "#/RelationalList?movie_id=";
    }

    public static class MedilinkLogs {
        public static final String API = "API連携";
        public static final String APP_CONTENTS = "{\"event\":\"contents\", \"title\":\"%s\",\"url\":\"%s\",\"referer\":\"%s\",\"check_mode\":\"%s\"}";
        public static final String APP_LAUNCH = "{\"event\":\"app_launch\"}";
        public static final String CONTENTS_OPEN = "コンテンツ表示";
        public static final String LAUNCH = "起動";
        public static final String LEVEL_INFO = "info";
    }

    public static class MedilinkUrls {
        public static final String ACTIVITY_GOTO_OTHERSITE = "http://app-client.medilink-study.com/goto_other_site";
        public static final String ACTIVITY_HISTORY_LIST = "http://app-client.medilink-study.com/historylist";
        public static final String ACTIVITY_HISTRY_LIST_CONTENTS = "http://app-client.medilink-study.com/history_list_contents?contents_id=";
        public static final String ACTIVITY_NOTE_HISTORY_LIST = "http://app-client.medilink-study.com/notelist";
        public static final String ACTIVITY_ONLINE_CONTENTS = "http://app-client.medilink-study.com/contents?contents_url=";
        public static final String ACTIVITY_ONLINE_ERROR = "http://app-client.medilink-study.com/error_online";
        public static final String ACTIVITY_SCAN = "http://app-client.medilink-study.com/scan";
        public static final String ACTIVITY_SETTING = "http://app-client.medilink-study.com/settings";
        public static final String APP_INNER_URL = "http://medilink-study.com/medilink_app/";
        public static final String APP_INNER_URL_HTTPS = "https://medilink-study.com/medilink_app/";
        public static final String BASE_URL = "http://app-client.medilink-study.com";
        public static final String GOOGLE_DRIVE_URL = "https://drive.google.com/viewerng/viewer?embedded=true&url=";
        public static final String MEDILINK_MOVIE_VIDEO_URL = "%s/cmaf/%s.mpd";
        public static final String QB_DISEASE_URL = "#/AppSearch?search_type=disease&disease_codes=";
        public static final String QB_SEARCH_URL = "#/AppSearch?search_type=qno&question_no=";
        public static final String UTF_8 = "utf-8";
    }

    public static class MenuName {
        public static final String BOOKSHELF = "bookshelf";
        public static final String NEWS = "news";
        public static final String NOTE = "note";
        public static final String SETTING = "setting";
    }

    public static class NoteFilter {
        public static final int ALL = 0;
        public static final int BOOKMARK = 3;
        public static final int MARKER_BLUE = 5;
        public static final int MARKER_GREEN = 6;
        public static final int MARKER_RED = 4;
        public static final int MARKER_YELLOW = 7;
        public static final int MEMO = 2;
        public static final int SEARCH = 1;
    }

    public static class NoteSort {
        public static final int CONTENTS = 1;
        public static final int DATE = 0;
    }

    public static class PrefsDefaultValue {
        public static final String FILTER_CALENDER_END_DEFAULT = "9999/01/01 00:00:00";
        public static final String FILTER_CALENDER_START_DEFAULT = "1900/01/01 00:00:00";
        public static final String FIRST_NOTE_TAB = "first_note_tab";
        public static final String HISTORY_DEFAULT_COLORS = "{\"colors\":[\"all\"]}";
        public static final String HISTORY_DEFAULT_CONTENTS = "{\"contents\":[\"all\"]}";
        public static final String ONLINE_SEARCH_SORT_INDEX_DEFAULT = "";
        public static final boolean ONLY_WIFI_DOWNLOAD_DEFAULT = false;
        public static final boolean RESUME_DEFAULT = true;
        public static final boolean WRITE_HISTORY_DEFAULT_BOOKMARK = true;
        public static final String WRITE_HISTORY_DEFAULT_COLORS = "{\"colors\":[\"all\"]}";
        public static final String WRITE_HISTORY_DEFAULT_CONTENTS = "{\"contents\":[\"all\"]}";
        public static final boolean WRITE_HISTORY_DEFAULT_MEMO = true;
    }

    public static class PrefsKey {
        public static final String ACCESS_TOKEN = "access_token";
        public static final String ACCESS_TOKEN_DATE = "access_token_limit_date";
        public static final String ACTIVE_USER = "active_user";
        public static final String AUTHENTICATED_AT = "authenticated_at";
        public static final String AUTO_BARISTA_TOKEN_UP_DATE = "auto_barista_token_update";
        public static final String AUTO_START_UP_DATE = "auto_startup_update";
        public static final String DEBUG_LOG_2_TOAST = "debug_log_2_toast";
        public static final String DISPLAY_PAGE = "display_page";
        public static final String DISP_TUTORIAL = "disp_tutorial";
        public static final String HISTORY_READ_COLOR_FILTER = "read_history_color_filter";
        public static final String HISTORY_READ_FILTER = "read_history_filter";
        public static final String HISTORY_TAB_INDEX = "history_tab_index";
        public static final String HISTORY_WRITE_BOOKMARK_FILTER = "write_history_bookmark_filter";
        public static final String HISTORY_WRITE_CALENDAR_END_FILTER = "write_history_calendar_end_filter";
        public static final String HISTORY_WRITE_CALENDAR_START_FILTER = "write_history_calendar_start_filter";
        public static final String HISTORY_WRITE_COLOR_FILTER = "write_history_color_filter";
        public static final String HISTORY_WRITE_FILTER = "write_history_filter";
        public static final String HISTORY_WRITE_MEMO_FILTER = "write_history_memo_filter";
        public static final String HISTORY_WRITE_SORT = "write_history_sort_mode";
        public static final String LIST_LAYOUT_MODE = "LIST_LAYOUT_MODE";
        public static final String LOGIN_ID = "login";
        public static final String LOGIN_USER_ROLE = "login_user_role";
        public static final String MAINTE_ID = "mainte_disp_lastdate";
        public static final String MAIN_TAB_INDEX = "main_tab_index";
        public static final String MARKER_COLOR = "marker_color";
        public static final String MEDILINK_ID = "medilink_id";
        public static final String MOVIE_PLAYLIST = "movie_play_playlist";
        public static final String MOVIE_PLAY_SPEED = "movie_play_play_speed";
        public static final String MOVIE_STAR = "movie_star";
        public static final String NEWS_ID = "news_disp_lastdate";
        public static final String NOTE_DATA_ID = "inner_note_default";
        public static final String NOTE_FILTER = "note_filter_mode";
        public static final String NOTE_SORT = "note_sort_mode";
        public static final String NOW_DISPLAY_VIDEO_CONTENTS_ID = "NOW_DISPLAY_VIDEO_CONTENTS_ID";
        public static final String OLD_LOGIN_ID = "old_login";
        public static final String ONLINE_SEARCH = "online_search";
        public static final String ONLINE_SEARCH_PURCHASE = "online_search_purchase";
        public static final String ONLINE_SEARCH_SORT_INDEX = "online_search_sort_index";
        public static final String ONLY_WIFI_DOWNLOAD = "only_wifi_download";
        public static final String PASSWORD_ID = "password";
        public static final String QR_PUERCHASE_CHECK = "qr_purchase_check";
        public static final String REFLESH_TOKEN = "reflesh_token";
        public static final String REFLESH_TOKEN_DATE = "reflesh_token_limit_date";
        public static final String RESUME_TOGGLE = "read_resume_toggle";
        public static final String REVIEW_MENU_LAYOUT = "review_menu_layout";
        public static final String REVIEW_MODE_NEW = "REVIEW_MODE_NEW";
        public static final String SEARCH_FILTER_AND_OR = "search_filter_and_or";
        public static final String SEARCH_FILTER_CONTAIN_PURCHASE = "search_filter_contain_purchase";
        public static final String SEARCH_FILTER_TMP_CHANGE_AND_OR = "search_filter_tmp_change_and_or";
        public static final String SEARCH_OPTION_FIRST_DISPLAY = "search_option_first_display";
        public static final String TERM_OF_SERVICE = "term_of_service";
        public static final String TMP_CHANGE_ONLINE_SEARCH_PURCHASE = "tmp_change_online_search_purchase";
        public static final String TMP_LOGIN_ID = "tmp_login";
        public static final String TMP_PASSWORD_ID = "tmp_password";
        public static final String TUTORIALE = "tutorial";
        public static final String USER_INFO = "barista_user_info";
        public static final String VIDEO_ENABLE_BACKGROUND = "video_play_enable_background";
        public static final String VIDEO_ENABLE_SKIP_TIME = "video_play_skip_time";
        public static final String VIDEO_RESUME_TOGGLE = "read_resume_toggle";
        public static final String WEBVIEW_FONT_SIZE = "webview_font_size";
    }

    public static class SearchSetting {
        public static final String BASE_THUMB_URL = "https://dptlba8sv1520.cloudfront.net/%s/search_thumb/%s.jpg";
        public static final int ERROR = 0;
        public static final String FILTER_MENU = "[{\"name\":\"未購入コンテンツを表示する\",\"key\":search_filter_contain_purchase,\"type\":1,\"labels\":[\"含む\",\"除く\"],\"displabels\":[\"未購入コンテンツを含む\",\"未購入コンテンツを除く\"]},{\"name\":\"AND/OR検索の切り替え\",\"key\":search_filter_and_or,\"type\":1,\"labels\":[\"AND検索\",\"OR検索\"],\"displabels\":[\"AND検索\",\"OR検索\"]}]";
        public static final int PURCHASE = 2;
        public static final int SETTING = 1;
    }

    public static class ServerInfo {
        static final String COOKIE_DOMAIN_dev = ".dev-medilink.com";
        static final String COOKIE_DOMAIN_honban = ".medilink-study.com";
        static final String COOKIE_DOMAIN_test = ".stg-medilink.com";
        public static final int DEV_SERVER = 0;
        public static final int PROD_SERVER = 2;
        public static final int STG_SERVER = 1;
        static final String barista_storeApi_test = "https://app.stg-medilink.com/";
        static final String qb_dev = "https://qb.dev-medilink.com/";
        static final String qb_honban = "https://qb.medilink-study.com/";
        static final String qb_image = "https://medilink-contents-qb-stg.s3.ap-northeast-1.amazonaws.com/%s/images/%s";
        static final String qb_test = "https://qb.stg-medilink.com/";
        static final String search_dev = "https://search.stg-medilink.com/";
        static final String search_honban = "https://search.medilink-study.com/";
        static final String search_test = "https://search.stg-medilink.com/";
        static final String storeApi_honban = "https://app.medilink-study.com/";
    }

    public static class SettingsMenu {
        public static final String QB_EXE_MODE = "qb_exe_mode";
    }

    public static class Tabs {
        public static final int BOOKSHELF = 0;
        public static final int NOTE = 1;
    }

    public static class VolleyInfo {
        public static final int NETWORK_DISABLED = -1;
        public static final int NETWORK_MOBILE = 1;
        public static final int NETWORK_WIFI = 0;
    }

    public static int getAccessTokenMargin() {
        return 21600;
    }

    public static String getBaristaSecret() {
        int i = CONNECT_MODE;
        if (i == 0 || i == 1) {
            return "ElTe7Mzrp9biuebk0xJhtluahQYd36HzneeuxhlQ";
        }
        if (i != 2) {
            return null;
        }
        return com.medicmedia.medilink.core.network.BuildConfig.BARISTA_SECRET;
    }

    public static String getPdfDownloadUrl() {
        int i = CONNECT_MODE;
        if (i == 0 || i == 1) {
            return "https://medilink-movies-stg.s3.ap-northeast-1.amazonaws.com/pdf/";
        }
        if (i != 2) {
            return null;
        }
        return com.medicmedia.medilink.ui.BuildConfig.VIDEO_PDF;
    }

    public static String getBaristaUrl() {
        int i = CONNECT_MODE;
        if (i == 0 || i == 1) {
            return "https://login.stg-medilink.com";
        }
        if (i != 2) {
            return null;
        }
        return "https://login.medilink-study.com";
    }

    public static String baristaToken() {
        return BaristaAuth.BARISUTA_GETTOKEN;
    }

    public static String getUser64() {
        Log.d("barista2", "Basic " + Base64.encodeToString(("medilink-app-client:" + BaristaAuth.BARISUTA_SECRET).getBytes(), 2));
        return "Basic " + Base64.encodeToString(("medilink-app-client:" + BaristaAuth.BARISUTA_SECRET).getBytes(), 2);
    }

    public static String getQBUrl() {
        int i = CONNECT_MODE;
        if (i == 0) {
            return "https://qb.dev-medilink.com/";
        }
        if (i == 1) {
            return "https://qb.stg-medilink.com/";
        }
        if (i != 2) {
            return null;
        }
        return "https://qb.medilink-study.com/";
    }

    public static String getStoreApi() {
        int i = CONNECT_MODE;
        if (i == 0 || i == 1) {
            return "https://app.stg-medilink.com/";
        }
        if (i != 2) {
            return null;
        }
        return "https://app.medilink-study.com/";
    }

    public static String getSearchApi() {
        int i = CONNECT_MODE;
        if (i == 0 || i == 1) {
            return "https://search.stg-medilink.com/api/search";
        }
        if (i != 2) {
            return null;
        }
        return "https://search.medilink-study.com/api/search";
    }

    public static String getSuggestApi() {
        int i = CONNECT_MODE;
        if (i == 0 || i == 1) {
            return "https://search.stg-medilink.com/api/suggest";
        }
        if (i != 2) {
            return null;
        }
        return "https://search.medilink-study.com/api/suggest";
    }

    public static String getCOOKIE_DOMAIN() {
        int i = CONNECT_MODE;
        if (i == 0) {
            return ".dev-medilink.com";
        }
        if (i == 1) {
            return ".stg-medilink.com";
        }
        if (i != 2) {
            return null;
        }
        return com.medicmedia.medilink.core.network.BuildConfig.COOKIE_DOMAIN;
    }

    static {
        String[] strArr = {"f5bead", "ffff9c", "d6fe9d", "bdfdfe"};
        colorcode = strArr;
        MARKER_COLOR_MAP = MLConst$$ExternalSyntheticBackport0.m(new Map.Entry[]{new AbstractMap.SimpleEntry(strArr[0], "ff0000"), new AbstractMap.SimpleEntry(strArr[1], "ffff00"), new AbstractMap.SimpleEntry(strArr[2], "7fff00"), new AbstractMap.SimpleEntry(strArr[3], "00bfff")});
    }
}
