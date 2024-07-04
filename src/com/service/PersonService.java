package com.service;

import com.model.Person;

public class PersonService {

    /*
     * 這邊只是為了問問題寫的簡單 sample code ，所以沒有附上 JDBC 或 Spring Data JPA 或 Hibernate
     * 查詢資料庫資料的程式碼，簡單塞假資料寫死。
     */
    public static Person getPersonData() {
        Person resultData = new Person();

        resultData.setUserID("AS001");
        resultData.setMessage01("森羅萬象盡化為灰燼『流刃若火』");
        resultData.setMessage02("盡敵螯殺『雀蜂』");
        resultData.setMessage03("射殺他『神鎗』");
        resultData.setMessage04("散落吧『千本櫻』");
        resultData.setMessage05("咆哮吧，蛇尾丸！你的敵人就在眼前。");
        resultData.setMessage06("甦醒吧『紅姫』");
        resultData.setMessage07("君臨者！血肉的面具，萬象 振翅高飛 冠上人類之名的東西！真理與節制 以爪立於不知罪的夢壁上！ 破道之33：蒼火墜");
        resultData.setMessage08("黑白之網！二十二個橋樑，六十六個冠帶，足跡 遠雷 尖峰 回地 夜伏 雲海 蒼藍序列 充滿太圓，直奔天上！縛道之77：天挺空羅");
        resultData.setMessage09("閃耀吧，『魄啜繚亂弟切花魁』！");
        resultData.setMessage10("龍鱗 反發 成雙之流星 解！");

        return resultData;
    }

}
