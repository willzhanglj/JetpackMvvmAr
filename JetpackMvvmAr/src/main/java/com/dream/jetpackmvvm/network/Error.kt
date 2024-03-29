package com.dream.jetpackmvvm.network

/**
 * 时间　: 2019/12/17
 * 描述　: 错误枚举类
 */
enum class Error(private val code: String, private val err: String) {

    /**
     * 未知错误
     */
    UNKNOWN("1000", "请求失败，请稍后再试"),
    /**
     * 解析错误
     */
    PARSE_ERROR("1001", "解析错误，请稍后再试"),
    /**
     * 网络错误
     */
    NETWORK_ERROR("1002", "网络连接错误，请稍后重试"),

    /**
     * 证书出错
     */
    SSL_ERROR("1004", "证书出错，请稍后再试"),

    /**
     * 连接超时
     */
    TIMEOUT_ERROR("1006", "网络连接超时，请稍后重试"),
    /**
     * app 未授权网络权限
     */
    APP_NOREQUEST_PREMISSION("1007", "未授权网络权限，请授权");//

    fun getValue(): String {
        return err
    }

    fun getKey(): String {
        return code
    }

}