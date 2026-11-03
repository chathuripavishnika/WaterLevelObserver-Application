import javax.swing.*;
import java.awt.*;

class Splitter extends WaterLevelObserver{
	
	private String id;
    private JLabel lblSplitter;
    

    private  JFrame frame;
    private JPanel panel;
	static int y=0;
	
    Splitter(String id) {
        this.id = id;
			y=y+100;
      
        
            frame = new JFrame("Splitter");
            frame.setSize(300, 150);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocation(1050, y);
            frame.setVisible(true);
           
			
			
            panel = new JPanel(new GridLayout(0, 1, 5, 5));
            panel.setBackground(new Color(255,255,0));
            frame.add(panel);
			if(frame != frame){
				frame.setLocation(50, 100);
			}

        //label alarm
        lblSplitter= new JLabel(id + " --> Splitter OFF", JLabel.CENTER);
        lblSplitter.setFont(new Font("", Font.BOLD, 20));

        panel.add(lblSplitter);
		frame.setVisible(true);
		
		
		
		
		
       
    }

   
    public void update(int waterLevel) {
		
        if (waterLevel > 75) {
            lblSplitter.setText(id + " --> Splitter ON");
        } else {
            lblSplitter.setText(id + " --> Splitter OFF");
        }
        
        
    }

    
    public String toString() {
        return id;
    }

	
	
	
	
	
}



