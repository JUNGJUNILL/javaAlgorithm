package javaOOP;

import java.util.*;



class MaterialInfo {
	

	private float stockQty=0; 
	private int materialPrice=0;
	
	public float getStockQty() {
		return stockQty;
	}
	public void setStockQty(float stockQty) {
		this.stockQty = stockQty;
	}
	public int getMaterialPrice() {
		return materialPrice;
	}
	public void setMaterialPrice(int materialPrice) {
		this.materialPrice = materialPrice;
	} 
	
	
}

public class P011_실무_Compartor {


	public static void main(String[] args) {	
		
		
		MaterialInfo[] models=new MaterialInfo[11];


		
		
		MaterialInfo m1 = new MaterialInfo(); 
		
		m1.setMaterialPrice(1000);
		m1.setStockQty(50);
		models[0] = m1;
		
		MaterialInfo m2 = new MaterialInfo(); 
		m2.setMaterialPrice(2000);
		m2.setStockQty(45);
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
		m11.setStockQty(75.5f);
		models[10] = m11;

		
		
		Arrays.sort(models,new Comparator<MaterialInfo>() {
			
			@Override
			public int compare(MaterialInfo o1, MaterialInfo o2) {
				
				int buyingPrice_o1 = o1.getMaterialPrice(); 
				int buyingPrice_o2 = o2.getMaterialPrice(); 
				
				int stockQty_o1 = Math.round(o1.getStockQty()); 
				int stockQty_o2 =Math.round(o2.getStockQty()); 
		
				//https://kin.naver.com/qna/detail.naver?d1id=1&dirId=1040201&docId=432220056&scrollTo=answer2
				//1순위 - 둘다있음, 2순위 - 재고만있음, 3순위 - 단가만있음, 4순위 - 둘다없음
				int rank1, rank2; 
				if(stockQty_o1 > 0 && buyingPrice_o1>0) rank1 =1; 
				else if(stockQty_o1>0) rank1=2; 
				else if(buyingPrice_o1>0) rank1=3;
				else rank1=4; 
				
				if(stockQty_o2 > 0 && buyingPrice_o2>0) rank2 =1; 
				else if(stockQty_o2>0) rank2=2; 
				else if(buyingPrice_o2>0) rank2=3;
				else rank2=4; 
				
				//우선순위가 같으면 재고순 정렬
				if(rank1 == rank2) return stockQty_o2-stockQty_o1; 
				
				//우선순위가 다르면 우선순위 정렬
				else return rank1 - rank2; 
				
				
				
//				오름차순 정렬
//				System.out.println(o1.getStockQty()+ " - " + o2.getStockQty()+"="+(o1.getStockQty() - o2.getStockQty()));
//				return o1.getStockQty() - o2.getStockQty();
			}
		
		});
		
		for(int i=0; i<models.length; i++){
			System.out.println("재고: "+models[i].getStockQty() + " : "+"단가: "+models[i].getMaterialPrice());
		}
		

		
	}

}

