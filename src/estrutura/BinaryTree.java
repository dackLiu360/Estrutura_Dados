/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

/**
 *
 * @author 31437974
 */
public class BinaryTree<E> {

	private Node<E> root; // raiz da árvore   

	BinaryTree(){
		// Cria uma árvore binária vazia 
		root=null;       
	}    

	public boolean isEmpty(){
if(root==null){
    return true;
}
else
    return false;
	}
	
public void addRoot(Node<E> e) throws Exception{
		// Adiciona uma raiz para a árvore, caso ela ainda não tenha    
	 
	}

	public Node<E> root() {
		// Devolve a raiz da árvore.   
	
}
	
public boolean isRoot(Node<E> n){
		// Verifica se um nó n é a raiz da árvore
	
	}

	public boolean isInternal(Node<E> n){
		// Verifica se um nó n é um nó interno  

	}

	public boolean isLeaf(Node<E> n) {
		// Verifica se um nó n é uma folha

	}

	public void addLeft(Node<E> n,Node<E> m) throws Exception{
		// Adiciona um nó m como filho n a esquerda 
		
	}

	public Node<E> left(Node<E> n) throws Exception{
		// Devolve o filho da esquerda de um nó n  
		
	}
	public boolean hasLeft(Node<E> n) {
		// Verifica se um vó n tem filho na esquerda    
	}

	public void addRight(Node<E> n,Node<E> m) throws Exception{
		// Adiciona o nó m como filho da direita do nó n
		
	}
	
       public Node<E> right(Node<E> n) throws Exception{
		// Devolve o filho da direita de um nó n 
		
	}

	public boolean hasRight(Node<E> n) {
		// Verifica se um nó n tem filho na direita 

	}

	public void remove(Node<E> n){
		// Remove um nó n e todos os seus descendentes da árvore
		
	}

}
