/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasemen;
public class Klasemen {
    String liga;
    int club, goalDif, point;
    Klasemen(){
        
    }
    Klasemen(String l, int p, int gd, int pts){
        liga = l;
        club = p;
        goalDif = gd;
        point = pts;
    }
    void tampil(){
        System.out.println("Club\t\t\t\t|\tPertandingan\t|\tGoalDifference\t|\tPoints");
        System.out.printf("%s\t\t|\t%d\t\t|\t\t%d\t|\t%d\n", liga, club, goalDif, point);
    }
}
