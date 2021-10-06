/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class DrawTooth extends JPanel {

        private GeneralPath caraUno;
        private GeneralPath caraDos;
        private GeneralPath caraTres;
        private GeneralPath caraCuatro;
        private GeneralPath caraCinco;
        private Object curCursor;
        private int numeroDeDiente;
        private Graphics2D g2;
        
        private Color tratamiento1;
        public Color getTratamiento1() {
                return tratamiento1;
        }


        public void setTratamiento1(Color tratamiento1) {
                this.tratamiento1 = tratamiento1;
        }


        public Color getTratamiento2() {
                return tratamiento2;
        }


        public void setTratamiento2(Color tratamiento2) {
                this.tratamiento2 = tratamiento2;
        }


        public Color getTratamiento3() {
                return tratamiento3;
        }


        public void setTratamiento3(Color tratamiento3) {
                this.tratamiento3 = tratamiento3;
        }


        public Color getTratamiento4() {
                return tratamiento4;
        }


        public void setTratamiento4(Color tratamiento4) {
                this.tratamiento4 = tratamiento4;
        }


        public Color getTratamiento5() {
                return tratamiento5;
        }


        public void setTratamiento5(Color tratamiento5) {
                this.tratamiento5 = tratamiento5;
        }


        private Color tratamiento2;
        private Color tratamiento3;
        private Color tratamiento4;
        private Color tratamiento5;

        public Graphics2D getG2() {
                return g2;
        }


        public void setG2(Graphics2D g2) {
                this.g2 = g2;
        }


        public DrawTooth(int numeroDeDiente,Color tratamiento1,Color tratamiento2,Color tratamiento3,Color tratamiento4,Color tratamiento5){

                caraUno=polygon(10,20,30,40,10,20,20,10);
                caraDos=polygon(10,20,20,10,10,20,30,40);
                caraTres=polygon(10,20,30,40,40,30,30,40);
                caraCuatro=polygon(40,30,30,40,40,30,20,10);
                caraCinco=polygon(20,30,30,20,20,20,30,30);
                this.numeroDeDiente=numeroDeDiente;

                this.tratamiento1=tratamiento1;
                this.tratamiento2=tratamiento2;
                this.tratamiento3=tratamiento3;
                this.tratamiento4=tratamiento4;
                this.tratamiento5=tratamiento5;


        }


        public int getNumeroDeDiente() {
                return numeroDeDiente;
        }


        public void setNumeroDeDiente(int numeroDeDiente) {
                this.numeroDeDiente = numeroDeDiente;
        }


        public GeneralPath getDos() {
                return caraDos;
        }


        public void setDos(GeneralPath dos) {
                this.caraDos = dos;
        }


        public GeneralPath getTres() {
                return caraTres;
        }


        public void setTres(GeneralPath tres) {
                this.caraTres = tres;
        }


        public GeneralPath getCuatro() {
                return caraCuatro;
        }


        public void setCuatro(GeneralPath cuatro) {
                this.caraCuatro = cuatro;
        }


        public GeneralPath getCinco() {
                return caraCinco;
        }


        public void setCinco(GeneralPath cinco) {
                this.caraCinco = cinco;
        }


        public GeneralPath getUno() {
                return caraUno;
        }




        public void setUno(GeneralPath uno) {
                this.caraUno = uno;
        }


        public GeneralPath polygon(int x1,int x2, int x3, int x4, int y1, int y2, int y3, int y4){

                int x1Points[] = {x1, x2, x3, x4};
                int y1Points[] = {y1, y2, y3, y4};

                GeneralPath polygon = 
                        new GeneralPath(GeneralPath.WIND_EVEN_ODD, x1Points.length);
                polygon.moveTo(x1Points[0], y1Points[0]);

                for (int index = 1; index < x1Points.length; index++) {
                        polygon.lineTo(x1Points[index], y1Points[index]);
                };

                polygon.closePath();

                return polygon;
        }


        public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g2 = (Graphics2D) g;


                BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_ROUND, 
                                BasicStroke.JOIN_BEVEL);
                g2.setStroke(bs1);
                if(tratamiento1!=null){
                        g2.setColor(tratamiento1);

                }else{
                        g2.setColor(Color.WHITE);
                }

                g2.fill(caraUno);
                g2.setColor(Color.BLACK);
                g2.draw(caraUno);

                if(tratamiento2!=null){
                        g2.setColor(tratamiento2);
                }else{
                        g2.setColor(Color.WHITE);
                }

                g2.fill(caraDos);
                g2.setColor(Color.BLACK);
                g2.draw(caraDos);


                if(tratamiento3!=null){
                        g2.setColor(tratamiento3);
                }else{
                        g2.setColor(Color.WHITE);
                }
                g2.fill(caraTres);
                g2.setColor(Color.BLACK);
                g2.draw(caraTres);


                if(tratamiento4!=null){
                        g2.setColor(tratamiento4);
                }else{
                        g2.setColor(Color.WHITE);
                }
                g2.fill(caraCuatro);
                g2.setColor(Color.BLACK);
                g2.draw(caraCuatro);

                if(tratamiento5!=null){
                        g2.setColor(tratamiento5);
                }else{
                        g2.setColor(Color.WHITE);
                }
                g2.fill(caraCinco);
                g2.setColor(Color.BLACK);
                g2.draw(caraCinco);



        }
}

