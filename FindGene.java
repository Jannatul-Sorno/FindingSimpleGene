public class FindGene{
	public String findGene(String dna){
		String result = "";

		int startIndex = dna.indexOf("ATG");
		int stopIndex = dna.indexOf("TAA");

		result = dna.substring(startIndex,stopIndex + 3);


		return result;
	}

	void testGene(){
		String dna = "AGTATGAACCTAAGCTG";
		String gene = findGene(dna);
	}
}