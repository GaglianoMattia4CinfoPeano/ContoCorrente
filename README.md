# ContoCorrente
Abbiamo fatto un progetto su netbeans che trattava un conto corrente, creando 3 classi ContoBancario, ContoEsteso, TestContoBancario.
Con la forma di ereditarietà si tratta che le sottoclassi possono ereditare tutti i metodi della superclasse.
Nel test bancario abbiamo fatto le prove per vedere se l'esercizio è corretto, per la stampa utilizzato il System.out.println, sul conto bancario messo un costruttore e dei get che danno il valore e te li da in output.
Invece sul conto sul conto esteso abbiamo utilizzato la parola "extends" per richiamare la superclasse cioè conto bancario,  nel costruttore utilizzato il super, per riprendere le variabili della superclasse; successivamente utilizzato un costruttore, dei get e i set per far si che l'utente chiede il valore.

EREDITARIETA':
Che cos'è: E' la possibilità di creare una sottoclasse che erediti gli attributi e i metodi di una superclasse.

serve a : Serve ad avere tutti i metodi e gli attributi della superclasse ereditati da una sottoclasse che ne potrà aggiungere di nuovi.

in questo progetto abbiamo creato la classe "ContoEsteso" facendole ereditare i metodi e gli attributi della classe "ContoBancario".

POLIMORFISMO:
Che cos'è:E' il riutilizzamento di un dato metodo ereditato da una superclasse cambiando ciò che fa quel metodo, viene contrassegnato con "@Override".

serve a: il polimorfismo serve per riscrivere dei metodi che magari devono svolgere una funzione simile ma algoritmicamente diversa o più specifica.

In questo progetto è stato ridefinito, nella classe derivata ContoEsteso, il metodo "preleva", già presente nella classe ContoBancario.

THIS:
La parola chiave "this" nel linguaggio Java serve per specificare l'attributo dell'oggetto corrente nel caso una variabile abbia lo stesso nome dell'attributo che si vuole usare.Si scrive il comando seguito da un punto e dall'attributo che si vuole usare.
