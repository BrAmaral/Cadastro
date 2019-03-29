public geradorSigla(String nomeDisciplina)
{
	int i = 0;
	int tamNome = 0;
	char letra1 = '\0';
	char letra2 = '\0';
	
	tamNome = nomeDisciplina.length();
	letra1 = nomeDisciplina.charAt(0);
	
	while(!letra2 == '\0'){
		for(i = 1; 1 < tamNome; i++){
			if(nomeDisciplina.charAt(i) == ' '){
				letra2 == nomeDisciplina.charAt(i + 1);
				break;
			}
		}
		
	}	

	
	
	
}