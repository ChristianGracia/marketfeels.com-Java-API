package com.cgstocksiteapi.cgstocksite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {

    @GetMapping(path="/")
    public String sendMessage() {
//        URL url = null;
//        try {
//            url = new URL("https://www.reddit.com/new.json");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        HttpURLConnection httpCon = null;
//        try {
//            httpCon = (HttpURLConnection) url.openConnection();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        BufferedReader br = new BufferedReader(new InputStreamReader( httpCon.getInputStream(),"utf-8"));
//
//        StringBuilder sb = new StringBuilder();
//        String line = null;
//        while (true) {
//
//                if (!((line = br.readLine()) != null)) break;
//
//            System.out.println(""+sb.toString());
//            sb.append(line + "\n");
//        }
//        br.close();
//
//        System.out.println(""+sb.toString());
        return "hiiii";

    }

}