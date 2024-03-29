
import java.util.*;



class MaterialInfo {
	

	private int stockQty=0; 
	private int materialPrice=0;
	
	public int getStockQty() {
		return stockQty;
	}
	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}
	public int getMaterialPrice() {
		return materialPrice;
	}
	public void setMaterialPrice(int materialPrice) {
		this.materialPrice = materialPrice;
	} 
	
	
	
	
	
}

public class Practice03 {


	public static void main(String[] args) {	
		
		
		MaterialInfo[] models=new MaterialInfo[12];
		
		MaterialInfo m1 = new MaterialInfo(); 
		m1.setMaterialPrice(0);
		m1.setStockQty(0);
		models[0] = m1;
		
		MaterialInfo m2 = new MaterialInfo(); 
		m2.setMaterialPrice(2000);
		m2.setStockQty(100);
		models[1] = m2;
		
		MaterialInfo m3 = new MaterialInfo(); 
		m3.setMaterialPrice(1000);
		m3.setStockQty(60);
		models[2] = m3;
		
		MaterialInfo m4 = new MaterialInfo(); 
		m4.setMaterialPrice(1000);
		m4.setStockQty(75);
		models[3] = m4;
		
		MaterialInfo m5 = new MaterialInfo(); 
		m5.setMaterialPrice(0);
		m5.setStockQty(50);
		models[4] = m5;
		
		MaterialInfo m6 = new MaterialInfo(); 
		m6.setMaterialPrice(0);
		m6.setStockQty(30);
		models[5] = m6;

		
		MaterialInfo m7 = new MaterialInfo(); 
		m7.setMaterialPrice(1000);
		m7.setStockQty(0);
		models[6] = m7;
	
		MaterialInfo m8 = new MaterialInfo(); 
		m8.setMaterialPrice(2000);
		m8.setStockQty(0);
		models[7] = m8;
		
		MaterialInfo m9 = new MaterialInfo(); 
		m9.setMaterialPrice(0);
		m9.setStockQty(0);
		models[8] = m9;
		
		MaterialInfo m10 = new MaterialInfo(); 
		m10.setMaterialPrice(0);
		m10.setStockQty(0);
		models[9] = m10;
		
		MaterialInfo m11 = new MaterialInfo(); 
		m11.setMaterialPrice(1000);
		m11.setStockQty(80);
		models[10] = m11;

		MaterialInfo m12 = new MaterialInfo(); 
		m12.setMaterialPrice(1000);
		m12.setStockQty(90);
		models[11] = m12;
		
		for(int i=0; i<models.length; i++){
			System.out.println("재고: "+models[i].getStockQty() + " : "+"단가: "+models[i].getMaterialPrice());
		}
		
		Arrays.sort(models,new Comparator<MaterialInfo>() {
		
			@Override
			public int compare(MaterialInfo o1, MaterialInfo o2) {
				
		
				//return o1.value - o2.value;
				
				//내림차순 정렬
				
//				단가 o , 재고 o
				if(o2.getStockQty()>0 && o1.getStockQty()>0){
					return o2.getStockQty() - o1.getStockQty(); 
					
				//단가 x , 재고 o
				}else if(o2.getStockQty()>0 && o1.getStockQty()>0){
					return o2.getStockQty() - o1.getStockQty();
					
				//단가 o , 재고 o
				}else if(o2.getStockQty()==0 && o1.getStockQty()==0){
					return o2.getStockQty() - o1.getStockQty();
					
				//단가x, 재고x 
				}else{
					return 1; 
				}
				
				//return o2.getMaterialPrice()-o1.getMaterialPrice();
				

			
				
//				오름차순 정렬
//				System.out.println(o1.getStockQty()+ " - " + o2.getStockQty()+"="+(o1.getStockQty() - o2.getStockQty()));
//				return o1.getStockQty() - o2.getStockQty();
			}
		
		});
		System.out.println("---------------------------------------");
		for(int i=0; i<models.length; i++){
			System.out.println("재고: "+models[i].getStockQty() + " : "+"단가: "+models[i].getMaterialPrice());
		}
		
	}

}

