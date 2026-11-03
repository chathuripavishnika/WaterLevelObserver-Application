import javax.swing.*;
import java.awt.*;

class Display extends WaterLevelObserver{
	
	private String id;
    private JLabel lblDisplay;
    

    private  JFrame frame;
    private JPanel panel;
	static int y=0;
	
    Display(String id) {
        this.id = id;
			y=y+100;
      
        
            frame = new JFrame("Display");
            frame.setSize(300, 150);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocation(400, y);
            frame.setVisible(true);
           
			
			
            panel = new JPanel(new GridLayout(0, 1, 5, 15));
            panel.setBackground(new Color(255, 165, 0));
            frame.add(panel);
			if(frame != frame){
				frame.setLocation(50, 100);
			}

        //label alarm
        lblDisplay= new JLabel(id + " --> Water Level", JLabel.CENTER);
        lblDisplay.setFont(new Font("", Font.BOLD, 20));

        panel.add(lblDisplay);
		frame.setVisible(true);
		
		
		
		
		
       
    }

   
    public void update(int waterLevel) {
		
        if (waterLevel <25) {
            lblDisplay.setText(id + " --> Water Level Good");
        } else {
            lblDisplay.setText(id + " --> Water Level Bad");
        }
        
        
    }

    
    public String toString() {
        return id;
    }

	
	
	
	
	
}


