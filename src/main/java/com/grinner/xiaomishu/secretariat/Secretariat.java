package com.grinner.xiaomishu.secretariat;

public class Secretariat {
    public static <T extends Secretary> T dispatch(Class<T> secretaryType) {
        try {
            T secretary = secretaryType.newInstance();
            return secretary;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) new NumbSecretary();
    }
}
