import javax.swing.*;
class Collection{
		private WaterLevelObserver[] waterLevelObserverArray=new WaterLevelObserver[0];
		private int waterLevel;
		
		public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
			extendArray();
			waterLevelObserverArray[waterLevelObserverArray.length-1]=waterLevelObserver;
		}
		private void extendArray(){
			WaterLevelObserver[] tempWaterLevelObserverArray=new WaterLevelObserver[waterLevelObserverArray.length+1];
			for (int i = 0; i < waterLevelObserverArray.length; i++){
				tempWaterLevelObserverArray[i]=waterLevelObserverArray[i];
			}
			waterLevelObserverArray=tempWaterLevelObserverArray;	
		}
		public void setWaterLevel(int waterLevel){
			if(this.waterLevel!=waterLevel){
				this.waterLevel=waterLevel;
					notifyDevices();
				}
		}
		private void notifyDevices(){
			for(WaterLevelObserver ob : waterLevelObserverArray){
				ob.update(waterLevel);
			}
		}

		

}
