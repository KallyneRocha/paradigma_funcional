//Funções de alta ordem

(defn aplicar-duas-vezes [funcao valor]
  (funcao (funcao valor)))

(defn duplicar [x]
  (* x 2))

(aplicar-duas-vezes duplicar 5)



(defn duplicar [x]
  (* x 2))

(def minha-funcao duplicar)
(def resultado (minha-funcao 7))


//Composição de funções

(defn quadrado [x]
  (* x x))

(defn ao-cubo [x]
  (* x x x))

(def quadrado-ao-cubo (comp quadrado ao-cubo))

(quadrado-ao-cubo 2) ;

//Imutabilidade

(def numeros [1 2 3 4]) 
(def numeros-dobrados (map #(* % 2) numeros))

//Funções puras

(defn somar [a b]
  (+ a b))

(somar 3 5)

//Recursão

(defn fatorial [n]
  (if (<= n 1)
    1
    (* n (fatorial (- n 1)))))

(fatorial 5)


//Currying

(defn adicionar [a]
  (fn [b] (+ a b)))

(def add-5 (adicionar 5))
(def resultado (add-5 3))