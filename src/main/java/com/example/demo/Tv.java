package com.example.demo;
class TvControl
{
    static void main(String[] args)
    {
        Tv lgTv = new Tv("LG");
        Tv sTv = new Tv("samsung");
        Tv hTv = new Tv("HP" ,2048);

        hTv.current_channel = 11;


        System.out.println(hTv.resolution);

        // TV 켜기
        // 볼륨 키우기
        // 채널 바꾸기
    }
}

public class Tv
{
    // 속성
    String model_name;
    int[] channel;
    int current_channel;
    int resolution;
    boolean power;



    Tv(String tv_name)
    {
        model_name = "tv_name";
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for(int i = 0; i < channel.length; i++)
        {
            channel[i] = i + 1;
        }
    }

    Tv(String tv_name , int resolution)
    {
        model_name = "tv_name";
        this.resolution = resolution;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for(int i = 0; i < channel.length; i++)
        {
            channel[i] = i + 1;
        }
    }

    // Getter Setter




    // 기능




}

