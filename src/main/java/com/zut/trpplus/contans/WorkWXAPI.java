package com.zut.trpplus.contans;

/**
 * @Author: hanyunfei
 * @Description:
 * @Date: 2017/10/12
 * @Modified By:
 */
public class WorkWXAPI {

    public static String CORPID = "wwc96797e9b16e610d"; //企业ID
    public static Integer AGENTID = 1000002;  //应用ID
    public static String SECRET = "1SO0i2Xx64Q_1XTLEBj3XmZpxk0KF1oTsJjsfdz8cWo"; //应用Secret
    public static String TOKEN = ""; //应用token（在接收消息->api接收中）
    public static String EncodingAESKey = ""; //消息加密key（在接收消息->api接收中）

    public static String GET_ACCESS_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + CORPID + "&corpsecret=" + SECRET;
    public static String GET_UESR_OPENID_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";
    public static String SEND_MESSAGE_URL = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";
    public static String GET_USER_INFO = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=USERID";

    //菜单相关
    public static String SEARCH_MENU_ID = ""; //自定义菜单ID
    public static String CANCEL_MENU_ID = "";//自定义菜单ID

    //标签相关
    public static Integer TAG_NAME_ID = 2; //企业微信中给预约好友定义的标签ID
    public static String TAG_ADD_USERS_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/addtagusers?access_token=ACCESS_TOKEN";
    public static String TAG_DELETE_USERS_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/deltagusers?access_token=ACCESS_TOKEN";
}
