class Main {
  public static void main(String[] args) {
    int dado[] = {10,12,14,15,22,37};
    
    System.out.println(busca_binaria_recursiva(dado, 22, 0, 5));
    System.out.println(busca_binaria_iterativa(dado, 22, 0, 5));
  }

  //Função que faz a busca binaria de maneira recursiva
  public static int busca_binaria_recursiva(int dado[], int x, int inf, int sup){
    if (inf > sup) return (-1);
    
    int meio = (inf + sup) / 2;
    if (x == dado[meio]) return(meio);
    else{
      if(x < dado[meio]) return busca_binaria_recursiva(dado, x, inf, meio-1);
      else return busca_binaria_recursiva(dado, x, meio+1, sup);  
    }
  }

  //função que faz a busca binaria de maneira iterativa
  public static int busca_binaria_iterativa(int dado[], int x, int inf, int sup){
    while(inf <= sup){
      int meio = (inf + sup) /2;

      if (dado[meio] == x) return meio;

      if (dado[meio] < x) inf = meio + 1;
      else sup = meio;
    }
    return -1;
  }
        
}