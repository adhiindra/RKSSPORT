package com.example.rkssport;

import java.util.ArrayList;

public class SportData {

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

    public ArrayList<String> getlBody() {
        return lBody;
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
        //Url Body
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AADFZ2RXmHbxs-bNbnwetv5la/BERSEPEDA.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AAATwqHcl3k4l6BvQSQGD2i3a/incworm.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AADgUf4MpmL2FvcNI3oO6VS7a/jumping%20lunges.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AAA2GfIvJ30xPQ88koEn9Eiha/Lompat%20tali.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AABEyp-oq5MSsq9RKqnNu5XOa/naik%20turun%20tangga.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AADwC_JJ1FLHNHRaCkGEAwaja/plank.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AACjJOnBv2TS_OlA4JgBHi05a/RUNNING.jpg?raw=1");
        mBody.add("https://www.dropbox.com/sh/wrfl8vnj0cfwy49/AABA4Ua9kg1GLu5oTwlVUa3Ca/skaters.jpg?raw=1");

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
