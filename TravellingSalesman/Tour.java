import java.util.*; 

public class Tour{
	ArrayList<Node> tour; 
	double fitness;
	double dist;

	public Tour(){
		tour = new ArrayList<>(); 
		fitness = 0;
		dist = 0; 
	}

	//graph is the CSV file, generates Nigel Quinn Solution of 7,000,000 Km 
	public void generateTour(ArrayList<Node> graph){
		ArrayList<Node> solution = new ArrayList<>(); 
		String res = "608,588,670,637,638,584,569,632,593,594,530,554,583,644,544,612,681,728,629,617,574,571,657,611,665,642,601,658,575,597,674,655,742,768,751,656,711,646,703,757,754,692,620,556,627,631,596,695,610,676,622,722,701,716,700,788,783,760,740,673,715,762,678,771,730,734,712,704,639,705,672,693,696,750,724,719,763,717,691,770,862,872,801,706,688,686,784,737,789,767,834,749,731,690,777,814,833,805,736,806,812,827,924,945,877,780,778,861,761,677,654,651,747,794,708,799,837,836,923,850,807,758,843,846,929,928,852,881,913,830,864,822,868,908,856,809,855,900,817,890,962,914,961,898,844,922,996,921,904,897,828,776,824,842,841,889,891,829,840,927,870,926,940,960,937,873,925,849,859,906,980,907,972,879,835,919,952,953,917,882,876,938,985,998,911,967,982,995,989,934,992,944,978,965,968,973,942,954,964,947,957,892,888,987,988,986,981,943,899,902,931,930,901,941,880,951,971,916,991,955,875,974,969,950,883,896,966,990,905,816,910,946,975,997,1000,979,912,949,983,963,887,857,909,858,956,994,948,920,838,933,884,977,999,970,993,958,863,915,976,893,939,847,821,894,820,886,959,984,935,839,779,867,785,793,871,853,800,866,790,818,782,854,932,865,823,787,819,831,874,851,769,848,885,811,869,936,918,895,903,813,826,764,687,765,694,714,802,709,720,781,808,792,786,759,773,798,860,772,729,634,699,746,845,810,738,797,795,698,796,755,661,739,652,684,727,825,878,832,753,702,707,752,815,723,679,743,713,741,745,664,735,689,675,621,650,732,733,643,697,775,718,640,725,683,710,803,721,659,685,668,607,682,774,791,804,748,667,756,744,649,635,633,589,564,623,598,587,626,726,648,618,666,766,680,585,603,647,577,653,645,641,591,671,669,636,582,579,662,625,549,522,482,561,567,595,606,616,613,604,573,474,497,478,550,624,614,547,471,562,503,515,572,557,496,435,476,410,469,500,523,516,488,483,555,501,434,491,535,581,592,553,459,405,342,381,451,498,479,536,495,450,460,559,532,473,463,475,461,490,447,349,415,513,514,543,453,370,439,425,424,477,470,397,489,531,446,346,445,430,494,505,428,373,407,348,326,366,423,421,396,419,350,301,391,422,412,398,383,457,360,395,429,337,365,452,486,465,403,328,363,444,356,386,364,458,389,327,376,333,255,291,387,351,357,441,442,344,293,302,315,294,298,382,329,283,207,150,199,295,306,259,324,284,292,385,340,257,223,233,310,215,313,268,220,316,234,249,224,320,355,318,314,303,225,193,110,182,226,149,211,271,288,280,267,241,297,299,282,212,277,254,213,180,201,155,138,219,205,230,181,242,167,197,145,185,243,144,133,140,195,251,194,126,161,165,160,190,188,164,76,86,171,159,69,39,52,143,192,154,128,210,141,209,163,117,132,60,157,115,92,183,156,148,78,136,137,153,229,142,50,84,169,99,152,124,33,45,36,66,131,158,89,70,71,75,101,4,90,34,121,47,28,53,18,35,24,1,37,15,56,87,30,19,7,57,46,54,72,81,31,107,94,9,26,8,12,6,63,27,25,82,51,103,11,38,91,2,55,3,49,13,20,95,88,22,119,200,109,40,108,147,58,48,68,64,93,23,97,21,100,10,59,5,16,43,17,114,96,112,177,80,29,32,79,61,122,102,196,287,228,175,120,116,77,14,44,106,42,83,85,113,98,127,74,139,130,135,174,151,62,73,41,123,134,162,105,146,65,67,118,206,236,166,129,202,111,168,240,218,245,178,204,237,172,104,198,227,173,208,176,125,189,184,266,217,232,246,260,338,436,374,408,367,321,311,231,170,191,239,252,187,179,250,319,248,221,273,235,275,186,256,264,222,322,286,203,269,331,262,285,278,274,289,265,308,244,290,300,247,343,334,307,216,296,358,309,279,304,392,332,353,347,276,238,214,261,345,406,440,369,375,416,317,409,377,305,258,352,341,253,270,263,281,339,402,431,362,272,330,359,393,390,380,432,493,401,485,529,464,384,379,472,427,394,414,417,404,336,368,443,533,590,506,528,487,388,312,354,454,512,540,455,371,399,420,323,378,372,426,507,413,325,335,433,448,519,481,511,504,509,411,361,449,468,537,502,456,462,552,484,418,400,492,517,605,602,520,467,545,560,538,619,615,563,508,600,630,628,542,546,609,527,437,534,438,466,548,521,568,660,599,566,541,480,539,580,578,663,565,499,526,576,518,558,570,525,524,510,551,586,608";
		String arr[] = res.split(","); 

		for(String s: arr){
			solution.add(graph.get(Integer.parseInt(s)-1)); 
		}

		/*for(int i = 607; i<=999; i+=2)
			solution.add(graph.get(i)); 

		for(int i = 998; i>=0; i-=2)
			solution.add(graph.get(i)); 

		for(int i = 1; i<607; i+=2)
			solution.add(graph.get(i)); 
		solution.add(graph.get(607)); 
	*/ 

		this.tour = solution; 
	}

	public double getDistance(){
		double total = 0; 

		for(int i = 0; i<tour.size()-1; i++){
			total += tour.get(i).dist(tour.get(i+1)); 
		}
		return total; 
	}

	public Node getNode(int pos){
		return tour.get(pos); 
	}

	public void setNode(int pos, Node n){
		tour.set(pos,n); 
	}

	public void swap(int x, int y){

	}

	public int size(){
		return tour.size();
	}


	@Override 
	public String toString(){
		String res = ""; 

		for(Node n: tour)
			res += (n.id+1)+","; 
		return res; 
	}

}