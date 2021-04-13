package com.streamliners;

import com.streamliners.models.Product;
import com.streamliners.models.Variant;
import com.streamliners.models.VariantBasedProduct;
import com.streamliners.models.WeightBasedProduct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
  //Create products
  Product apple= new WeightBasedProduct("Apple","",10F,50F);
  Product banana= new VariantBasedProduct("Banana","",new ArrayList<>(
          Arrays.asList(
                  new Variant("500gF",20f)
        ,new Variant("1kgF",40f)
          )
  ));
   //Add them in a list
        List<Product> products= new ArrayList<>(
                Arrays.asList(apple,banana)
        );




        System.out.println(products);



    }




}
