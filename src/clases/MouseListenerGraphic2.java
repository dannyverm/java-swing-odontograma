/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import odontograma.FrmOdontograma;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;




public class MouseListenerGraphic2  extends MouseAdapter{
        private JPanel canvas;
        private JFrame frame;
        private JPanel panelDeDientes1;
        //private OdontogramaAction1 odonto;
        private FrmOdontograma odonto;


        public MouseListenerGraphic2(DrawTooth canvas,FrmOdontograma odonto){
                this.canvas=canvas;
                this.odonto=odonto;
                this.panelDeDientes1=odonto.getPanelDeDientes2();
        }
        

    @Override
       public void mouseClicked(MouseEvent e) {
                JPanel box=  odonto.getCheckBox();
                JRadioButton button1= (JRadioButton) box.getComponent(0);
                JRadioButton button2= (JRadioButton) box.getComponent(1);
                Color color=null;

                if( button1.isSelected()){
                        color=color.RED;
                }else if(button2.isSelected()){
                        color=color.BLUE;
                }else{
                        color=color.WHITE;
                }
                
                JPanel contentPane = panelDeDientes1;   
                for(int z=1;z<40;z++){
                        if((z>=10&&z<20)||(z>=30&&z<=40)){
                                ((JComponent) contentPane.getComponent(z)).setBorder(BorderFactory.createEmptyBorder());
                                 contentPane.getComponent(z).setFocusable(false);
                        }
                }

                
                
                DrawTooth can=(DrawTooth) canvas;
                int diente= (int) can.getNumeroDeDiente();

if(can.getTratamiento1()==Color.BLACK){

        if(diente<=10){
                ((JComponent) contentPane.getComponent(diente+9)).setBorder(BorderFactory.createLineBorder(Color.black));
                contentPane.getComponent(diente+9).setFocusable(true);
                panelDeDientes1.repaint();
        }else{          
                ((JComponent) contentPane.getComponent(diente+19)).setBorder(BorderFactory.createLineBorder(Color.black));
                contentPane.getComponent(diente+19).setFocusable(true);
                panelDeDientes1.repaint();}
        
}else{
                


                if(((DrawTooth) canvas).getUno().contains(e.getX(), e.getY())) {

                        odonto.paintTooth2(diente,color,can.getTratamiento2(),can.getTratamiento3(),can.getTratamiento4(),can.getTratamiento5());

                } else if(((DrawTooth) canvas).getDos().contains(e.getX(), e.getY())) {

                        odonto.paintTooth2(diente,can.getTratamiento1(),color,can.getTratamiento3(),can.getTratamiento4(),can.getTratamiento5());

                } else if(((DrawTooth) canvas).getTres().contains(e.getX(), e.getY())) {



                        odonto.paintTooth2(diente,can.getTratamiento1(),can.getTratamiento2(),color,can.getTratamiento4(),can.getTratamiento5());




                } else if(((DrawTooth) canvas).getCuatro().contains(e.getX(), e.getY())) {


                        odonto.paintTooth2(diente,can.getTratamiento1(),can.getTratamiento2(),can.getTratamiento3(),color,can.getTratamiento5());




                } else if(((DrawTooth) canvas).getCinco().contains(e.getX(), e.getY())) {


                        odonto.paintTooth2(diente,can.getTratamiento1(),can.getTratamiento2(),can.getTratamiento3(),can.getTratamiento4(),color);


                }else{
                        System.out.println("click empty");
                }
                
                

                if(diente<=10){
                        ((JComponent) contentPane.getComponent(diente+9)).setBorder(BorderFactory.createLineBorder(Color.black));
                        contentPane.getComponent(diente+9).setFocusable(true);
                        panelDeDientes1.repaint();
                }else{          
                        ((JComponent) contentPane.getComponent(diente+19)).setBorder(BorderFactory.createLineBorder(Color.black));
                        contentPane.getComponent(diente+19).setFocusable(true);
                        panelDeDientes1.repaint();}

}
        }       
}
