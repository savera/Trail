
public class Trail {

	public Trail(int[] markers) {
		
	}

	public boolean isLevelTrailSegment(int start, int end) {
		
		int[] markers = {0, 160, 100, 60, 45, 50, 20, 75, 75, 70, 80, 120, 130};
		
		int startElevation = markers[start]; 
		
		int  endElevation = markers[end]; 
		
		int elevation = 0; 
		
		if(startElevation > endElevation){
			
			elevation = startElevation - endElevation; 
			
		}else{
			
			elevation = endElevation - startElevation; 
			
		}
		if(elevation <= 10){
			
			return true; 
			
		}else{
			
			return false;
			
		}
		
	}

	public boolean isDifficult() {
		
		int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		
		int difficultElevations = 0; 
		
		for (int i = 0; i < markers.length; i++) {
			
			int one = markers[i]; 
			
			int two = markers[i+1]; 
			
			int elevation = one - two; 
			
			if (elevation >= 30) {
				
				difficultElevations = difficultElevations + 1; 
				
			}else if (elevation <= -30) {
				
				difficultElevations = difficultElevations + 1; 
				
			}else {}
			
		}
		if (difficultElevations >= 3) {
			
			return true; 
			
		}else {
			
			return false;
			
		}
	}
}
