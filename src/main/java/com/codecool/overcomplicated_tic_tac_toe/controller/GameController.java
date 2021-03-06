package com.codecool.overcomplicated_tic_tac_toe.controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class GameController {
    final static String AVATAR_URL = "http://www.avatarpro.biz/avatar?size=90"; // TODO: Change this to be dynamic, and it should be the same for at least the session

    public static ModelAndView renderWelcome(Request req, Response res){
        Map params = new HashMap<>();
        params.put("avatar_url", AVATAR_URL);
        return new ModelAndView(params, "welcome");
    }

    public static ModelAndView renderGame(Request req, Response res){
        Map params = new HashMap<>();
        params.put("avatar_url", AVATAR_URL);
        params.put("comic_url", "https://placeholdit.imgix.net/~text?txtsize=33&txt=place%20of%20a%20comic&w=700&h=200");
        return new ModelAndView(params, "game");
    }
}
