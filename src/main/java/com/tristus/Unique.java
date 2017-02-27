package com.tristus;


public class Unique {

    public String checkForUnique (String str){

        String str2 = "";


            for (char c : str.toCharArray()) {

                int i = 0;

                if (str.indexOf(c) == str.lastIndexOf(c)){


                    str2 = str2.concat(c+String.valueOf(i++));

                }

                return str2;


}
return str2;

    }}
