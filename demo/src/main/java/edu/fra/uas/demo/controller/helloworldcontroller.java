package edu.fra.uas.demo.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fra.uas.demo.DemoApplication;


@Controller
public class helloworldcontroller {
    
    Fach geo = new Fach(2);
    Fach Mathe = new Fach(3); 
    Fach Deutsch = new Fach(2);
    Fach Englisch = new Fach(3);
    Fach Sport = new Fach(1);

    Fach[] fächer = {Mathe, Englisch, Deutsch, Sport, geo};
    double Durchschnitt = berechneDurchschnitt(fächer);

    public static double berechneDurchschnitt(Fach[] fächer) {
        int summe = 0;
        int counter =0;


        for (int i =0; i < fächer.length; i++) {
               summe += fächer[i].getnote();
               counter ++;              
           }

           double mittelwert = (double)summe / counter;
           return mittelwert;
           

        }

    @RequestMapping(value="hello", method=RequestMethod.GET)
    @ResponseBody
    public double getHelloWorld() {
        return berechneDurchschnitt(fächer);
        //return "<h1>Hello World Spring Boot!</h1>";
    }

}


   // public static void main(String[] args) {
	//	
    //    Fach Mathe = new Fach(3); 
    //    Fach Deutsch = new Fach(2);
     //   Fach Englisch = new Fach(3);
     //   Fach Sport = new Fach(1);

     //   Fach[] fächer = {Mathe, Englisch, Deutsch, Sport} ;

     //   double Durchschnitt = berechneDurchschnitt(fächer);
    //    System.out.println("Durchschnitt: " + Durchschnitt);


   // }
   //     public static double berechneDurchschnitt(Fach[] fächer) {
   //         int summe = 0;
   //         int counter = 0;

    //        for (int i =0; i < fächer.length; i++) {
   //             summe += fächer[i].getnote();
   //             counter ++;
                
  //          }

  //          double mittelwert = (double)summe / counter;
  //          return mittelwert;

  //      }

//	}








