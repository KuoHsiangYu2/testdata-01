package com.model;

import java.io.Serializable;
import java.util.Objects;

/* Data class 用來儲存資料。 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userID;

    private String message01;

    private String message02;

    private String message03;

    private String message04;

    private String message05;

    private String message06;

    private String message07;

    private String message08;

    private String message09;

    private String message10;

    public Person() {
        super();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getMessage01() {
        return message01;
    }

    public void setMessage01(String message01) {
        this.message01 = message01;
    }

    public String getMessage02() {
        return message02;
    }

    public void setMessage02(String message02) {
        this.message02 = message02;
    }

    public String getMessage03() {
        return message03;
    }

    public void setMessage03(String message03) {
        this.message03 = message03;
    }

    public String getMessage04() {
        return message04;
    }

    public void setMessage04(String message04) {
        this.message04 = message04;
    }

    public String getMessage05() {
        return message05;
    }

    public void setMessage05(String message05) {
        this.message05 = message05;
    }

    public String getMessage06() {
        return message06;
    }

    public void setMessage06(String message06) {
        this.message06 = message06;
    }

    public String getMessage07() {
        return message07;
    }

    public void setMessage07(String message07) {
        this.message07 = message07;
    }

    public String getMessage08() {
        return message08;
    }

    public void setMessage08(String message08) {
        this.message08 = message08;
    }

    public String getMessage09() {
        return message09;
    }

    public void setMessage09(String message09) {
        this.message09 = message09;
    }

    public String getMessage10() {
        return message10;
    }

    public void setMessage10(String message10) {
        this.message10 = message10;
    }

    @Override
    public int hashCode() {
        return Objects.hash(message01, message02, message03, message04, message05, message06, message07, message08,
                message09, message10, userID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        boolean compareResult = (Objects.equals(message01, other.message01)
                && Objects.equals(message02, other.message02) && Objects.equals(message03, other.message03)
                && Objects.equals(message04, other.message04) && Objects.equals(message05, other.message05)
                && Objects.equals(message06, other.message06) && Objects.equals(message07, other.message07)
                && Objects.equals(message08, other.message08) && Objects.equals(message09, other.message09)
                && Objects.equals(message10, other.message10) && Objects.equals(userID, other.userID));
        return compareResult;
    }

}
