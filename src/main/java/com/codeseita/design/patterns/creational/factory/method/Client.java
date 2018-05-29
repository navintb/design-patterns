/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeseita.design.patterns.creational.factory.method;

/**
 *
 * @author navin
 */
public class Client {

    public static void main(String[] args) {
        PolygonFactory factory = new PolygonFactory();
        Polygon polygon = factory.getPolygon(3);
        System.out.println(polygon.getType());
        polygon = factory.getPolygon(4);
        System.out.println(polygon.getType());
    }
}
