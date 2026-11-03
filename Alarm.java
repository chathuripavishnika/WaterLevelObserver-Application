import javax.swing.*;
import java.awt.*;
class Alarm extends WaterLevelObserver{
    
    private String id;
    private JLabel lblAlarm;
    

    private  JFrame frame;
    private JPanel panel;
	static int y=0;
	
    Alarm(String id) {
        this.id = id;
			y=y+100;
      
        
            frame = new JFrame("Alarm");
            frame.setSize(300, 150);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocation(50, y);
            frame.setVisible(true);
           
			
			
            panel = new JPanel(new GridLayout(0, 1, 5, 20));
            panel.setBackground(new Color(255, 0, 0));
            frame.add(panel);
			if(frame != frame){
				frame.setLocation(50, 100);
			}

       
        lblAlarm = new JLabel(id + " --> Water Level ", JLabel.CENTER);
        lblAlarm.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(lblAlarm);
		frame.setVisible(true);
		
	}

   
    public void update(int waterLevel) {
		
        if (waterLevel <80) {
            lblAlarm.setText(id + " --> Water Level UP");
        } else {
            lblAlarm.setText(id + " --> Water Level Danger!");
        }
        
        
    }

    
    public String toString() {
        return id;
    }

	
	
	
	
	
}










