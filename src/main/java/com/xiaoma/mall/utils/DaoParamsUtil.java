package com.xiaoma.mall.utils;

/**
 * 字段检测工具类
 *
 */
public class DaoParamsUtil {
    /**
     * 判断字段是否为空字符串
     *
     * @param o 将传进来的字段提升为Object类型
     * @return true 为null或空字符串
     *         false 否
     */
    public static boolean isBlank(Object o) {
        if (o == null) {
            return true;
        } else {
            if (o instanceof String) {
                if ("".equals(o.toString().trim())) {
                    return true;
                }
            }
            return false;
        }

    }
}
