package com.example.rkssport;

import java.util.ArrayList;

public class SportData {

    //Judul Body
    ArrayList <String> jBodym = new ArrayList<>();

    //Judul Beginer
    ArrayList <String> jBeginerm = new ArrayList<>();

    //Judul Advance
    ArrayList <String> jAdvancem = new ArrayList<>();

    //Judul Expert
    ArrayList <String> jExpertm = new ArrayList<>();

    //Data Body Pria
    ArrayList <String> bMonth1m = new ArrayList<>();
    ArrayList <String> bMonth2m = new ArrayList<>();
    ArrayList <String> bMonth3m = new ArrayList<>();

    //Data Body Wanita
    ArrayList <String> bMonth1w = new ArrayList<>();
    ArrayList <String> bMonth2w = new ArrayList<>();
    ArrayList <String> bMonth3w = new ArrayList<>();

    //Data Beginer Pria
    ArrayList <String> bgMonth1m = new ArrayList<>();
    ArrayList <String> bgMonth2m = new ArrayList<>();
    ArrayList <String> bgMonth3m = new ArrayList<>();

    //Data Beginer Wanita
    ArrayList <String> bgMonth1w = new ArrayList<>();
    ArrayList <String> bgMonth2w = new ArrayList<>();
    ArrayList <String> bgMonth3w = new ArrayList<>();

    //Data Advanced Pria
    ArrayList <String> aMonth1m = new ArrayList<>();
    ArrayList <String> aMonth2m = new ArrayList<>();
    ArrayList <String> aMonth3m = new ArrayList<>();

    //Data Advanced Pria
    ArrayList <String> aMonth1w = new ArrayList<>();
    ArrayList <String> aMonth2w = new ArrayList<>();
    ArrayList <String> aMonth3w = new ArrayList<>();

    //Data Expert Pria
    ArrayList <String> xMonth1m = new ArrayList<>();
    ArrayList <String> xMonth2m = new ArrayList<>();
    ArrayList <String> xMonth3m = new ArrayList<>();

    //Data Expert Wanita
    ArrayList <String> xMonth1w = new ArrayList<>();
    ArrayList <String> xMonth2w = new ArrayList<>();
    ArrayList <String> xMonth3w = new ArrayList<>();


    //URL FOTO
    ArrayList <String> mQuotes = new ArrayList<>(); //Quotes
    ArrayList <String> mBody = new ArrayList<>(); //Body
    ArrayList <String> mImageUrl = new ArrayList<>(); //Beginer
    ArrayList <String> mImageUrl1 = new ArrayList<>(); //Advance
    ArrayList <String> mImageUrl2 = new ArrayList<>(); //Expert

    //Link Youtube
    ArrayList <String> lBody = new ArrayList<>(); //Body
    ArrayList <String> link1 = new ArrayList<>(); //Beginer
    ArrayList <String> link2 = new ArrayList<>(); //Advance
    ArrayList <String> link3 = new ArrayList<>(); //Expert

    public ArrayList<String> getLink1() {
        return link1;
    }


    public ArrayList<String> getjBodym() {
        return jBodym;
    }


    public ArrayList<String> getjBeginerm() {
        return jBeginerm;
    }



    public ArrayList<String> getjAdvancem() {
        return jAdvancem;
    }



    public ArrayList<String> getjExpertm() {
        return jExpertm;
    }


    public ArrayList<String> getlBody() {
        return lBody;
    }

    public ArrayList<String> getbMonth1m() {
        return bMonth1m;
    }

    public ArrayList<String> getbMonth2m() {
        return bMonth2m;
    }

    public ArrayList<String> getbMonth3m() {
        return bMonth3m;
    }

    public ArrayList<String> getbMonth1w() {
        return bMonth1w;
    }

    public ArrayList<String> getbMonth2w() {
        return bMonth2w;
    }

    public ArrayList<String> getbMonth3w() {
        return bMonth3w;
    }

    public ArrayList<String> getBgMonth1m() {
        return bgMonth1m;
    }

    public ArrayList<String> getBgMonth2m() {
        return bgMonth2m;
    }

    public ArrayList<String> getBgMonth3m() {
        return bgMonth3m;
    }

    public ArrayList<String> getBgMonth1w() {
        return bgMonth1w;
    }

    public ArrayList<String> getBgMonth2w() {
        return bgMonth2w;
    }

    public ArrayList<String> getBgMonth3w() {
        return bgMonth3w;
    }

    public ArrayList<String> getaMonth1m() {
        return aMonth1m;
    }

    public ArrayList<String> getaMonth2m() {
        return aMonth2m;
    }

    public ArrayList<String> getaMonth3m() {
        return aMonth3m;
    }

    public ArrayList<String> getaMonth1w() {
        return aMonth1w;
    }

    public ArrayList<String> getaMonth2w() {
        return aMonth2w;
    }

    public ArrayList<String> getaMonth3w() {
        return aMonth3w;
    }

    public ArrayList<String> getxMonth1m() {
        return xMonth1m;
    }

    public ArrayList<String> getxMonth2m() {
        return xMonth2m;
    }

    public ArrayList<String> getxMonth3m() {
        return xMonth3m;
    }

    public ArrayList<String> getxMonth1w() {
        return xMonth1w;
    }

    public ArrayList<String> getxMonth2w() {
        return xMonth2w;
    }

    public ArrayList<String> getxMonth3w() {
        return xMonth3w;
    }

    public ArrayList<String> getmBody() {
        return mBody;
    }

    public ArrayList<String> getmQuotes() {
        return mQuotes;
    }

    public ArrayList<String> getmImageUrl2() {
        return mImageUrl2;
    }

    public ArrayList<String> getLink2() {
        return link2;
    }

    public ArrayList<String> getLink3() {
        return link3;
    }

    public ArrayList<String> getmImageUrl1() {
        return mImageUrl1;
    }

    public ArrayList<String> getmImageUrl() {
        return mImageUrl;
    }


    void setData(){

        //Judul
        //Judul Body
        jBodym.add("Bicycling");
        jBodym.add("Inchworm");
        jBodym.add("Jumping lunges");
        jBodym.add("Skiping Rope");
        jBodym.add("Naik turun tangga ");
        jBodym.add("Plank");
        jBodym.add("Running");
        jBodym.add("Skaters");

        //Judul Beginer
        jBeginerm.add("Arm circles clockwise");
        jBeginerm.add("Cobra stretch");
        jBeginerm.add("Diamound push-up");
        jBeginerm.add("Incline push-up");
        jBeginerm.add("Jumping jacks");
        jBeginerm.add("Leg raises");
        jBeginerm.add("Side hop");
        jBeginerm.add("Mountain climber");
        jBeginerm.add("Push up");
        jBeginerm.add("Russian twist");
        jBeginerm.add("Sit up");
        jBeginerm.add("Squat Jump");
        jBeginerm.add("Triceps dips");
        jBeginerm.add("Wide arm push-up");

        //Judul Advanced
        jAdvancem.add("Bicycle crunches");
        jAdvancem.add("Cobra stretch");
        jAdvancem.add("Crossover crunch");
        jAdvancem.add("Decline push up");
        jAdvancem.add("Flooe tricep dips");
        jAdvancem.add("Hel touch");
        jAdvancem.add("Jumping jacks");
        jAdvancem.add("Leg barberll curl left");
        jAdvancem.add("Plank");
        jAdvancem.add("Push up and Rotation");
        jAdvancem.add("Push Up");
        jAdvancem.add("Spine lumbar twist stretch left");
        jAdvancem.add("Spine lumbar twist stretch right");
        jAdvancem.add("Staggered push-up");
        jAdvancem.add("V-up");
        jAdvancem.add("Wide Arm Push Up");

        //Judul Expert
        jExpertm.add("Abdominal crunches");
        jExpertm.add("Bicycle crunches ");
        jExpertm.add("Box push up  ");
        jExpertm.add("Burpess ");
        jExpertm.add("Butt bridge ");
        jExpertm.add("Chest stretch ");
        jExpertm.add("Cobra stretch ");
        jExpertm.add("Crossover crunch ");
        jExpertm.add("Decline push up ");
        jExpertm.add("Diamond push up ");
        jExpertm.add("Floor Tricep Dips");
        jExpertm.add("heel Touch");
        jExpertm.add("Jumping caks ");
        jExpertm.add("Spine lumbar twist stretch left ");
        jExpertm.add("Mountain climber ");
        jExpertm.add("Plank");
        jExpertm.add("Push up & rotation ");
        jExpertm.add("Push up");
        jExpertm.add("Side plank left ");
        jExpertm.add("tSide plank right");
        jExpertm.add("Sit Up");
        jExpertm.add("Spine Lumbar Twist Stretch Left");
        jExpertm.add("Spine Lumbar Twist Stretch");
        jExpertm.add("Staggered Push Up");
        jExpertm.add("V-up Exercise");
        jExpertm.add("Wide Arm Push");



        //Body
        //Data Body Pria Month1 //Sesuain sama list yang ada pas masukin Datanya
        bMonth1m.add("Lakukanlah Olahraga Bersepedah selama 25 Menit");
        bMonth1m.add("Lakukanlah Olahraga Incworm selama 5 menit");
        bMonth1m.add("Lakukanlah Olahraga Jumping lunges selama 5 menit");
        bMonth1m.add("Lakukanlah Olahraga Skiping Rope selama 5 menit");
        bMonth1m.add("Lakukanlah Olahraga Naik turun tangga selama 5 menit");
        bMonth1m.add("Lakukanlah Olahraga Plank selama 30 second");
        bMonth1m.add("Lakukanlah Olahraga Running selama 10 menit");
        bMonth1m.add("Lakukanlah Olahraga Skaters selama 3 menit");

        //Data Body Pria Month2 //Sesuain sama list yang ada pas masukin Datanya
        bMonth2m.add("Lakukanlah Olahraga Bersepedah selama 35 menit");
        bMonth2m.add("Lakukanlah Olahraga Incworm selama 10 menit");
        bMonth2m.add("Lakukanlah Olahraga Jumping lunges selama 10 menit");
        bMonth2m.add("Lakukanlah Olahraga Skiping Rope selama 10 menit");
        bMonth2m.add("Lakukanlah Olahraga Naik turun tangga selama 10 menit");
        bMonth2m.add("Lakukanlah Olahraga Plank selama 30 second");
        bMonth2m.add("Lakukanlah Olahraga Running selama 20 menit");
        bMonth2m.add("Lakukanlah Olahraga Skaters selama 6 menit");

        //Data Body Pria Month3 //Sesuain sama list yang ada pas masukin Datanya
        bMonth3m.add("Lakukanlah Olahraga Bersepedah selama 45 menit");
        bMonth3m.add("Lakukanlah Olahraga Incworm selama 15 menit");
        bMonth3m.add("Lakukanlah Olahraga Jumping lunges selama 15 menit");
        bMonth3m.add("Lakukanlah Olahraga Skiping Rope selama 15 menit");
        bMonth3m.add("Lakukanlah Olahraga Naik turun tangga selama 15 menit");
        bMonth3m.add("Lakukanlah Olahraga Plank selama 1 menit");
        bMonth3m.add("Lakukanlah Olahraga Running selama 25 menit");
        bMonth3m.add("Lakukanlah Olahraga Skaters selama 9 menit");

        //Data Body Wanita Month1 //Sesuain sama list yang ada pas masukin Datanya
        bMonth1w.add("Lakukanlah Olahraga Bersepedah selama 15 menit");
        bMonth1w.add("Lakukanlah Olahraga Incworm selama 3 menit");
        bMonth1w.add("Lakukanlah Olahraga Jumping lunges selama 3 menit");
        bMonth1w.add("Lakukanlah Olahraga Skiping Rope selama 3 menit");
        bMonth1w.add("Lakukanlah Olahraga Naik turun tangga selama 3 menit");
        bMonth1w.add("Lakukanlah Olahraga Plank selama 15 second");
        bMonth1w.add("Lakukanlah Olahraga Running selama 10 menit");
        bMonth1w.add("Lakukanlah Olahraga Skaters selama 2 menit");

        //Data Body Wanita Month2 //Sesuain sama list yang ada pas masukin Datanya
        bMonth2w.add("Lakukanlah Olahraga Bersepedah selama 20 menit");
        bMonth2w.add("Lakukanlah Olahraga Incworm selama 6 menit");
        bMonth2w.add("Lakukanlah Olahraga Jumping lunges selama 4 menit");
        bMonth2w.add("Lakukanlah Olahraga Skiping Rope selama 5 menit");
        bMonth2w.add("Lakukanlah Olahraga Naik turun tangga selama 5 menit");
        bMonth2w.add("Lakukanlah Olahraga Plank selama 15 second");
        bMonth2w.add("Lakukanlah Olahraga Running selama 15 menit");
        bMonth2w.add("Lakukanlah Olahraga Skaters selama 4 menit");

        //Data Body Wanita Month3 //Sesuain sama list yang ada pas masukin Datanya
        bMonth3w.add("Lakukanlah Olahraga Bersepedah selama 25 menit");
        bMonth3w.add("Lakukanlah Olahraga Incworm selama 9 menit");
        bMonth3w.add("Lakukanlah Olahraga Jumping lunges selama 6 menit");
        bMonth3w.add("Lakukanlah Olahraga Skiping Rope selama 10 menit");
        bMonth3w.add("Lakukanlah Olahraga Naik turun tangga selama 10 menit");
        bMonth3w.add("Lakukanlah Olahraga Plank selama 25 second");
        bMonth3w.add("Lakukanlah Olahraga Running selama 20 menit");
        bMonth3w.add("Lakukanlah Olahraga Skaters selama 7 menit");

        //Beginer
        //Data Beginer Pria Month1 //Sesuain sama list yang ada pas masukin Datanya
        bgMonth1m.add("Lakukanlah Olahraga Arm circles clockwise 2 menit");
        bgMonth1m.add("Lakukanlah Olahraga Cobra stretch 3 second");
        bgMonth1m.add("Lakukanlah Olahraga Diamound push-up 5 kali");
        bgMonth1m.add("Lakukanlah Olahraga Incline push-up 5 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Jumping jacks 1 ment");
        bgMonth1m.add("Lakukanlah Olahraga Leg raises 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Side hop 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Mountain climber 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Push up 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Russian twist 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Squat Jump 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Triceps dips 10 kali dengan 3 kali set");
        bgMonth1m.add("Lakukanlah Olahraga Wide arm push-up 10 kali dengan 3 kali set");

        //Data Beginer Pria Month2 //Sesuain sama list yang ada pas masukin Datanya
        bgMonth2m.add("Lakukanlah Olahraga Arm circles clockwise 4 menit");
        bgMonth2m.add("Lakukanlah Olahraga Cobra stretch 3 second");
        bgMonth2m.add("Lakukanlah Olahraga Diamound push-up 10 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Incline push-up 10 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Jumping jacks 2 menit");
        bgMonth2m.add("Lakukanlah Olahraga Leg raises 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Side hop 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Mountain climber 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Push up 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Russian twist 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Sit up 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Squat Jump 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Triceps dips 15 kali dengan 3 kali set");
        bgMonth2m.add("Lakukanlah Olahraga Wide arm push-up 15 kali dengan 3 kali set");

        //Data Beginer Pria Month3 //Sesuain sama list yang ada pas masukin Datanya
        bgMonth3m.add("Lakukanlah Olahraga Arm circles clockwise 5 menit");
        bgMonth3m.add("Lakukanlah Olahraga Cobra stretch 2 menit");
        bgMonth3m.add("Lakukanlah Olahraga Diamound push-up 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Incline push-up 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Jumping jacks 10 menit dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Leg raises 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Side hop 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Mountain climber 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Push up 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Russian twist 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Sit up 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Squat Jump 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Triceps dips 20 kali dengan 3 kali set");
        bgMonth3m.add("Lakukanlah Olahraga Wide arm push-up 20 kali dengan 3 kali set");


        //Data Beginer Wanita Month1 //Sesuain sama list yang ada pas masukin Datanya
        bgMonth1w.add("Lakukanlah Olahraga Arm circles clockwise 5 menit");
        bgMonth1w.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        bgMonth1w.add("Lakukanlah Olahraga Diamound push-up 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Incline push-up 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Jumping jacks 3 menit");
        bgMonth1w.add("Lakukanlah Olahraga Leg raises 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Side hop 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Mountain climber 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Push up 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Russian twist 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Sit up 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Squat Jump 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Triceps dips 3 kali dengan 3 kali set");
        bgMonth1w.add("Lakukanlah Olahraga Wide arm push-up 3 kali dengan 3 kali set");

        //Data Beginer Wanita Month2 //Sesuain sama list yang ada pas masukin Datanya
        bgMonth2w.add("Lakukanlah Olahraga Arm circles clockwise 5 menit");
        bgMonth2w.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        bgMonth2w.add("Lakukanlah Olahraga Diamound push-up 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Incline push-up 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Jumping jacks 1 menit");
        bgMonth2w.add("Lakukanlah Olahraga Leg raises 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Side hop 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Mountain climber 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Push up 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Russian twist 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Sit up 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Squat Jump 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Triceps dips 6 kali dengan 3 kali set");
        bgMonth2w.add("Lakukanlah Olahraga Wide arm push-up 6 kali dengan 3 kali set");

        //Data Beginer Wanita Month3 //Sesuain sama list yang ada pas masukin Datanya
        bgMonth3w.add("Lakukanlah Olahraga Arm circles clockwise 5 menit");
        bgMonth3w.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        bgMonth3w.add("Lakukanlah Olahraga Diamound push-up 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Incline push-up 1 menit");
        bgMonth3w.add("Lakukanlah Olahraga Jumping jacks 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Leg raises 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Side hop 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Mountain climber 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Push up 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Russian twist 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Sit up 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Squat Jump 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Triceps dips 15 kali dengan 3 kali set");
        bgMonth3w.add("Lakukanlah Olahraga Wide arm push-up 15 kali dengan 3 kali set");


        //Advanced
        //Data Advance Pria month1 //Sesuain sama list yang ada pas masukin Datanya
        aMonth1m.add("Lakukanlah Olahraga Bicycle crunches 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga cobra Stretch 1 menit");
        aMonth1m.add("Lakukanlah Olahraga Crossover crunch 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Decline push up 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Flooe tricep dips 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Hel touch 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Jumping jacks 1 menit");
        aMonth1m.add("Lakukanlah Olahraga Leg barberll curl left 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Plank 30 second");
        aMonth1m.add("Lakukanlah Olahraga Push up and Rotation 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Push Up 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Spine lumbar twist stretch left 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Spine lumbar twist stretch right 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga Staggered push-up 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga V-up 10 kali dengan 3 kali set ");
        aMonth1m.add("Lakukanlah Olahraga Wide Arm Push Up 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga");

        //Data Advance Pria month2 //Sesuain sama list yang ada pas masukin Datanya
        aMonth2m.add("TLakukanlah Olahraga Bicycle crunches 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga cobra Stretch 1 ment");
        aMonth2m.add("Lakukanlah Olahraga Crossover crunch 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Decline push up 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Flooe tricep dips 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Hel touch 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Jumping jacks 2 ment");
        aMonth2m.add("Lakukanlah Olahraga Leg barberll curl left 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Plank 3 menit");
        aMonth2m.add("Lakukanlah Olahraga Push up and Rotation 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Push Up 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Spine lumbar twist stretch left 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Spine lumbar twist stretch right 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Staggered push-up 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga V-up 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga Wide Arm Push Up 30 kali dengan 3 kali set");
        aMonth2m.add("Lakukanlah Olahraga");

        //Data Advance Pria month3 //Sesuain sama list yang ada pas masukin Datanya
        aMonth3m.add("Lakukanlah Olahraga Bicycle crunches 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga cobra Stretch 1 ment");
        aMonth3m.add("Lakukanlah Olahraga Crossover crunch 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Decline push up 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Flooe tricep dips 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Hel touch 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Jumping jacks 5 menit");
        aMonth3m.add("Lakukanlah Olahraga Leg barberll curl left 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Plank 6 menit");
        aMonth3m.add("Lakukanlah Olahraga Push up and Rotation 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Push Up 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Spine lumbar twist stretch left 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Spine lumbar twist stretch right 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Staggered push-up 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga V-up 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga Wide Arm Push Up 40 kali dengan 3 kali set");
        aMonth3m.add("Lakukanlah Olahraga");

        //Data Advance Wanita month1 //Sesuain sama list yang ada pas masukin Datanya
        aMonth1w.add("Lakukanlah Olahraga Bicycle crunches 5 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga cobra Stretch 1 ment");
        aMonth1w.add("Lakukanlah Olahraga Crossover crunch 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Decline push up 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Flooe tricep dips 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Hel touch 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Jumping jacks 1 menit");
        aMonth1w.add("Lakukanlah Olahraga Leg barberll curl left 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Plank 30 second");
        aMonth1w.add("Lakukanlah Olahraga Push up and Rotation 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Push Up 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Spine lumbar twist stretch left 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Spine lumbar twist stretch right 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Staggered push-up 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga V-up 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga Wide Arm Push Up 5 kali dengan 3 kali set");
        aMonth1w.add("Lakukanlah Olahraga");

        //Data Advance Wanita month2 //Sesuain sama list yang ada pas masukin Datanya
        aMonth2w.add("Lakukanlah Olahraga Bicycle crunches 10 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga cobra Stretch 1 menit");
        aMonth2w.add("Lakukanlah Olahraga Crossover crunch 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Decline push up 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Flooe tricep dips 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Hel touch 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Jumping jacks 1 menit ");
        aMonth2w.add("Lakukanlah Olahraga Leg barberll curl left 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Plank 1 menit");
        aMonth2w.add("Lakukanlah Olahraga Push up and Rotation 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Push Up 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Spine lumbar twist stretch left 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Staggered push-up 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga V-up 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga Wide Arm Push Up 10 kali dengan 3 kali set");
        aMonth2w.add("Lakukanlah Olahraga");

        //Data Advance Wanita month3 //Sesuain sama list yang ada pas masukin Datanya
        aMonth3w.add("Lakukanlah Olahraga Bicycle crunches 15 kali dengan 3 kali set");
        aMonth1m.add("Lakukanlah Olahraga cobra Stretch 1 menit");
        aMonth3w.add("Lakukanlah Olahraga Crossover crunch 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Decline push up 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Flooe tricep dips 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Hel touch 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Jumping jacks 1 menit");
        aMonth3w.add("Lakukanlah Olahraga Leg barberll curl left 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Plank 1,5 menit dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Push up and Rotation 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Push Up 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Spine lumbar twist stretch left 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Spine lumbar twist stretch right 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Staggered push-up 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga V-up 15 kali dengan 3 kali set");
        aMonth3w.add("Lakukanlah Olahraga Wide Arm Push Up 15 kali dengan 3 kali set");

        //Expert
        //Data Expert Pria month1 //Sesuain sama list yang ada pas masukin Datanya
        xMonth1m.add("Lakukanlah Olahraga Abdominal crunches 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Bicycle crunches 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Box push up 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Burpess 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Butt bridge 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Chest stretch 1 menit");
        xMonth1m.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        xMonth1m.add("Lakukanlah Olahraga Crossover crunch 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Decline push up 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Diamond push up 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Floor Tricep Dips 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga heel Touch 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Jumping caks 3 menit");
        xMonth1m.add("Lakukanlah Olahraga Spine lumbar twist stretch left 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Mountain climber 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Plank 5 menit");
        xMonth1m.add("Lakukanlah Olahraga Push up & rotation 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Push up 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Side plank left  5 menit");
        xMonth1m.add("Lakukanlah Olahraga Side plank right  5 menit");
        xMonth1m.add("Lakukanlah Olahraga Sit Up 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch Left  5 menit");
        xMonth1m.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch  5 menit");
        xMonth1m.add("Lakukanlah Olahraga Staggered Push Up 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga V-up Exercise 20 kali dengan 4 kali Set");
        xMonth1m.add("Lakukanlah Olahraga Wide Arm Push 20 kali dengan 4 kali Set");

        //Data Expert Pria month2 //Sesuain sama list yang ada pas masukin Datanya
        xMonth2m.add("Lakukanlah Olahraga Abdominal crunches 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Bicycle crunches 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Box push up 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Burpess 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Butt bridge 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Chest stretch 1 menit");
        xMonth2m.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        xMonth2m.add("Lakukanlah Olahraga Crossover crunch 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Decline push up 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Diamond push up 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Floor Tricep Dips 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga heel Touch 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Jumping caks 5 menit");
        xMonth2m.add("Lakukanlah Olahraga Spine lumbar twist stretch left 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Mountain climber 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Plank 10 menit");
        xMonth2m.add("Lakukanlah Olahraga Push up & rotation 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Push up 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Side plank left 10 menit ");
        xMonth2m.add("Lakukanlah Olahraga Side plank right 10 menit");
        xMonth2m.add("Lakukanlah Olahraga Sit Up 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch Left 10 menit");
        xMonth2m.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch 10 menit");
        xMonth2m.add("Lakukanlah Olahraga Staggered Push Up 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga V-up Exercise 40 kali dengan 4 kali Set");
        xMonth2m.add("Lakukanlah Olahraga Wide Arm Push 40 kali dengan 4 kali Set");

        //Data Expert Pria month3 //Sesuain sama list yang ada pas masukin Datanya
        xMonth3m.add("Lakukanlah Olahraga Abdominal crunches 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Bicycle crunches 55 kali dengan 4 kali Set ");
        xMonth3m.add("Lakukanlah Olahraga Box push up 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Burpess 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Butt bridge 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Chest stretch 1 menit");
        xMonth3m.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        xMonth3m.add("Lakukanlah Olahraga Crossover crunch 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Decline push up 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Diamond push up 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Floor Tricep Dips 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga heel Touch 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Jumping caks 5 menit dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Spine lumbar twist stretch left 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Mountain climber 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Plank 10 menit");
        xMonth3m.add("Lakukanlah Olahraga Push up & rotation 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Push up 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Side plank left 10 menit");
        xMonth3m.add("Lakukanlah Olahraga Side plank right 10 menit ");
        xMonth3m.add("Lakukanlah Olahraga Sit Up 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch Left 10 menit");
        xMonth3m.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch 10 menit");
        xMonth3m.add("Lakukanlah Olahraga Staggered Push Up 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga V-up Exercise 55 kali dengan 4 kali Set");
        xMonth3m.add("Lakukanlah Olahraga Wide Arm Push 55 kali dengan 4 kali Set");

        //Data Expert Wanita month1 //Sesuain sama list yang ada pas masukin Datanya
        xMonth1w.add("Lakukanlah Olahraga Abdominal crunches 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Bicycle crunches 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Box push up 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Burpess 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Butt bridge 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Chest stretch 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Crossover crunch 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Decline push up 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Diamond push up 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Floor Tricep Dips 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga heel Touch 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Jumping caks 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Spine lumbar twist stretch left 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Mountain climber 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Plank 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Push up & rotation 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Push up 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Side plank left 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Side plank right 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Sit Up 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch Left 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch 1 menit");
        xMonth1w.add("Lakukanlah Olahraga Staggered Push Up 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga V-up Exercise 5 kali dengan 4 kali Set");
        xMonth1w.add("Lakukanlah Olahraga Wide Arm Push 5 kali dengan 4 kali Set");

        //Data Expert Wanita month2 //Sesuain sama list yang ada pas masukin Datanya
        xMonth2w.add("Lakukanlah Olahraga Abdominal crunches 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Bicycle crunches 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Box push up 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Burpess 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Butt bridge 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Chest stretch 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Cobra stretch 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Crossover crunch 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Decline push up 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Diamond push up 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Floor Tricep Dips 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga heel Touch 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Jumping caks 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Spine lumbar twist stretch left 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Mountain climber 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Plank 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Push up & rotation 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Push up 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Side plank left 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Side plank right menit");
        xMonth2w.add("Lakukanlah Olahraga Sit Up 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch Left 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch 1 menit");
        xMonth2w.add("Lakukanlah Olahraga Staggered Push Up 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga V-up Exercise 10 kali dengan 4 kali Set");
        xMonth2w.add("Lakukanlah Olahraga Wide Arm Push 10 kali dengan 4 kali Set");

        //Data Expert Wanita month3 //Sesuain sama list yang ada pas masukin Datanya
        xMonth3w.add("Lakukanlah Olahraga Abdominal crunches 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Bicycle crunches 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Box push up 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Burpess 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Butt bridge 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Chest stretch 1 menit ");
        xMonth3w.add("Lakukanlah Olahraga Decline push up 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Diamond push up 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Floor Tricep Dips 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga heel Touch 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Jumping caks 1 menit");
        xMonth3w.add("Lakukanlah Olahraga Spine lumbar twist stretch left 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Mountain climber 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Plank 2 menit");
        xMonth3w.add("Lakukanlah Olahraga Push up & rotation 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Push up 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Side plank left 2 menit");
        xMonth3w.add("Lakukanlah Olahraga Side plank right 2 menit");
        xMonth3w.add("Lakukanlah Olahraga Sit Up 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch Left 1 menit");
        xMonth3w.add("Lakukanlah Olahraga Spine Lumbar Twist Stretch 1 menit");
        xMonth3w.add("Lakukanlah Olahraga Staggered Push Up 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga V-up Exercise 15 kali dengan 4 kali Set");
        xMonth3w.add("Lakukanlah Olahraga Wide Arm Push 15 kali dengan 4 kali Set");



        //Link Youtube Body
        lBody.add("54GhsiBY-aw");
        lBody.add("VSp0z7Mp5IU");
        lBody.add("y7Iug7eC0dk");
        lBody.add("a6wq_eljQN8");
        lBody.add("C4ZKuZF4r0k");
        lBody.add("pSHjTRCQxIw");
        lBody.add("fQ7ewHFw_I8");
        lBody.add("4RuxhVJ4-pg");

        //Link Youtube Beginer
        link1.add("MY0Wx6hSdMs");
        link1.add("Aa6zdmje-c4");
        link1.add("J0DnG1_S92I");
        link1.add("EPR87NMAxik");
        link1.add("7w6M4bOXJ_s");
        link1.add("JB2oyawG9KI");
        link1.add("dvbjlbs5rm0");
        link1.add("nmwgirgXLYM");
        link1.add("IODxDxX7oi4");
        link1.add("wkD8rjkodUI");
        link1.add("ALLz1NnGWcs");
        link1.add("aclHkVaku9U");
        link1.add("6kALZikXxLc");
        link1.add("rr6eFNNDQdU");

        //Link Youtube Advance
        link2.add("9FGilxCbdz8");
        link2.add("Aa6zdmje-c4");
        link2.add("qmvUVaDza-M");
        link2.add("HO_E8D-4MR8");
        link2.add("pnt7HBOvUj8");
        link2.add("C35_SRFBwHM");
        link2.add("7w6M4bOXJ_s");
        link2.add("y50USvnOrwQ");
        link2.add("pSHjTRCQxIw");
        link2.add("HO_E8D-4MR8");
        link2.add("IODxDxX7oi4");
        link2.add("BzYBkAvdCJY");
        link2.add("BzYBkAvdCJY");
        link2.add("YEuQAAZJJbg");
        link2.add("riAutegDqdI");
        link2.add("rr6eFNNDQdU");


        //Link Youtube Expert
        link3.add("6BvYD6yw2QE");
        link3.add("9FGilxCbdz8");
        link3.add("zpS-qGzcH4s");
        link3.add("dZgVxmf6jkA");
        link3.add("eedJTiasudk");
        link3.add("F6nMuJ7Z5_w");
        link3.add("Aa6zdmje-c4");
        link3.add("qmvUVaDza-M");
        link3.add("HO_E8D-4MR8");
        link3.add("J0DnG1_S92I");
        link3.add("pnt7HBOvUj8");
        link3.add("C35_SRFBwHM");
        link3.add("7w6M4bOXJ_s");
        link3.add("y50USvnOrwQ");
        link3.add("nmwgirgXLYM");
        link3.add("pSHjTRCQxIw");
        link3.add("HO_E8D-4MR8");
        link3.add("IODxDxX7oi4");
        link3.add("_9XwAHX5Li4");
        link3.add("_9XwAHX5Li4");
        link3.add("ALLz1NnGWcs");
        link3.add("BzYBkAvdCJY");
        link3.add("BzYBkAvdCJY");
        link3.add("YEuQAAZJJbg");
        link3.add("riAutegDqdI");
        link3.add("rr6eFNNDQdU");

        //Image UrL
        //Url Body
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AADFZ2RXmHbxs-bNbnwetv5la/BERSEPEDA.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AAATwqHcl3k4l6BvQSQGD2i3a/incworm.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AADgUf4MpmL2FvcNI3oO6VS7a/jumping%20lunges.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AAA2GfIvJ30xPQ88koEn9Eiha/Lompat%20tali.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AABEyp-oq5MSsq9RKqnNu5XOa/naik%20turun%20tangga.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AADwC_JJ1FLHNHRaCkGEAwaja/plank.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AACjJOnBv2TS_OlA4JgBHi05a/RUNNING.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AABA4Ua9kg1GLu5oTwlVUa3Ca/skaters.jpg?raw=1");

        //Url Quotes
        mQuotes.add("https://pixfeeds.com/images/quotes/famous-sports-quotes/1280-1200-586929934-sports-quote-on-fitness.jpg");
        mQuotes.add("https://previews.123rf.com/images/ambassador806/ambassador8061608/ambassador806160800007/62133811-banner-cita-de-motivaci%C3%B3n-entrenamiento-deportivo-la-motivaci%C3%B3n-del-cartel-impresi%C3%B3n-inspirada-de-negocios-pa.jpg");
        mQuotes.add("https://image.freepik.com/vector-gratis/fondo-cita-deportiva-estilo-grunge-mensaje-inspirador_23-2147795012.jpg");
        mQuotes.add("https://image.freepik.com/vector-gratis/fondo-cita-deporte-mensaje-inspirador_23-2147805228.jpg");

        //Url Beginer
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AACRDxiCfWr7oPRNVV7rC_EVa/arm%20circle%20clock%20wise.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AABAkFNy8t_J2kvlxx7ucnT7a/cobra%20stretch.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AACNRfDU1JZgUw43UGABGhSja/diamond%20push%20up.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AABxk7ekH8E33sWtyR5bXaq1a/incline%20push%20up.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AADO3-zkyzzP_v1iFAHfXxTua/jumping%20jacks.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AABX1mty9CvfTLKK3MHpnNj7a/leg%20raises.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AACnfUS9575g4X8mX4nUBdWfa/side%20hop.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AADghIgw8OO0b89uHQyynnzva/mountain%20climber.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AAB0Skhmk2bBZnrHIsbVHA-ya/push%20up.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AAAYiepfyv_Gwuen9t_986Xka/rusian%20twist.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AACfVuVzGPcIkxIK4-_FG11Za/sit%20up.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AACLpUNXv8QnaucvuU62lRZEa/squat%20jump.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AAB7-GuZhVWmcnzJCmRzBDOra/tricept%20dips.jpg?raw=1");
        mImageUrl.add("https://www.dropbox.com/sh/q4s5tiqb3qg89dp/AAA48BnUnHUipTRV1grw4kGQa/wide%20push%20up.jpg?raw=1");

        //Url Advance
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AADw6F3UrdBXJc7QjGiaa8nOa/Bicycle%20crunches.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AABvs_Gy4MEi4-4Qn3Bo32yya/cobra%20stretch.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AACiHihTbKSngDsLbwVaPnFra/Crossover%20crunch.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AACFWFcaC3DQVC34SQumWh0ka/decline-push-ups.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AADxmSxM24nKV90nSy1Kqxdma/floor%20tricep%20dips.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AACS2KonmGo-Y_qtBz8SicVna/heel%20touch.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AAAHejQWO3PCu0ZSIwcbLzUSa/jumping_jacks_main.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AACXyjtUWrtqpdR9SGWcRBZUa/Leg%20barberll%20curl%20left.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AACoYu4ta0WyvayKzAhPilxva/plank.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AAD7mGtDGeKt-6AY9-Dgl8lOa/pushup%20and%20rotation.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AABa5LZg68PToNLxBICqp1p6a/Pushups.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AADTseG-OhDwszbCKPPvyrifa/Spine%20lumbar%20twist%20stretch%20left.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AAC6hH-MHWlP5bFrmv4HcyQCa/Spine%20lumbar%20twist%20stretch%20right.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AABErRvFsM-JSs3HLa_MMJAWa/Staggered-Push-Up.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AAAbsENc2wqsgEyoefcwLmLZa/V-Up_Exercise.jpg?raw=1");
        mImageUrl1.add("https://www.dropbox.com/sh/l51rzb4a0i02vg7/AAAoJDsnVWo5B3CGizL_LliYa/Wide%20Arm%20Push%20Ups.jpg?raw=1");

        //Url Expert
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAAJk7ekL9QpVqR2CRWRuXeya/Abdominal%20crunches.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAB8SlVtPb1_SMOgHU4K81gRa/Bicycle%20crunches.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADjOg8ZduOROndr3GzKaPZYa/box%20push%20up.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAD_OYlwmPHjgVqPQ9rKELBUa/Burpees.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAAyhEFnAuVTzYUf_DHxtTBca/butt%20bridges.png?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADxQ5wpyxGclN_nVxjmtr2da/chest%20stretch.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AACFjomeWacv1slSJmlG3d23a/cobra%20stretch.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADyEes3pXXm1Mz9SBhMR0zaa/Crossover%20crunch.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AABljpNBl2Rf0EvAedjfkUqZa/decline-push-ups.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AACx2t1fzmAWvGxNg0cbUFAma/Diamond-Push-Up.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAAuxgGfjwXgNVBDz9mh7c4Ga/floor%20tricep%20dips.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAAnP9TstTLryyBpqhWSKM2Ra/heel%20touch.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAAmF18BZHo7XC0MEIaQ0-Gea/jumping_jacks_main.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AACBPCTIWkN2EYowrVVHa30Ga/Leg%20barberll%20curl%20left.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AACBcWHTL3eor5kgPFTnrPWBa/Mountain%20climber.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADGjLoxBFasIeT4QKnCmnA3a/plank.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AABaU1OmuI7QGXPEz85A4hsya/pushup%20and%20rotation.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AACeTfFROrjTwDyJf5JqYg8oa/Pushups.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AABA0Esl93NtGygfUjzvWh70a/Side%20plank%20left.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADL4O-XmYHzG55Mc5q283jxa/Side%20plank%20right.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADYtKRxbKbAtllI0t3fP4dea/sit%20up.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AABGeSmyWFRQUoazejrQ7MMEa/Spine%20lumbar%20twist%20stretch%20left.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAC6crx9c3OSgeE2lOQaG2MZa/Spine%20lumbar%20twist%20stretch%20right.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADKkEt1mmpmvsTXF32Emj0oa/Staggered-Push-Up.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AADtoinnMRLxc94HxHzwUMLra/V-Up_Exercise.jpg?raw=1");
        mImageUrl2.add("https://www.dropbox.com/sh/8f6iwkddma49rc3/AAAET1mg__raNnZUZZlWVeqqa/Wide%20Arm%20Push%20Ups.jpg?raw=1");





    }


}
