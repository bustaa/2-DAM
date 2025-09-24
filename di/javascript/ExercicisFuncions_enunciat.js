//Executeu este codi i mireu el que mostra per consola

let dies=["Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres","Dissabte","Diumenge"];
function paraCada(array, accio){
    for(let i=0;i<array.length;i++){
        accio(array[i]);
    }
}
paraCada(dies,console.log);

//Modifiqueu-lo per a que faça el mateix utilitzant una funció fletxa (=>)
console.log("----------------------------------");

const paraCada2 = (array, accio) => {
    for (let i = 0; i < array.length; i++) {
        accio(array[i]);
    }
}
paraCada2(dies, console.log);

//Modifiqueu el codi per a que faça el mateix utilitzant el mètode forEach()
console.log("----------------------------------");

const paraCada3 = (array, accio) => {
   return array.forEach(elem => accio(elem));
}
paraCada3(dies, console.log);

// Que cree un altre array on calcule el numero de caracters de cada dia de la setmana
// ex: numCar=[7,7,8,6,9,8,8] 
// i després que mostre el contingut dels dos arrays de la següent manera:
// Dilluns: 7
// Dimarts: 7
// Dimecres: 8
// ...

console.log("----------------------------------");

const paraCada4 = (array, accio) => {
    return array.forEach(elem => accio(`${elem}: ${elem.length}`))
}
paraCada4(dies, console.log);

//Mostra els dies que ténen més de 7 caracters (filter)
console.log("----------------------------------");

const paraCada5 = (array, accio) => {
    return accio(array.filter( elem => elem.length > 7));
}
paraCada5(dies, console.log);

console.log("----------------------------------");
/* Ara volem fer el mateix, però que ens torne un String amb els dies que ténen més de 7 caracters */
/* reduce */

const paraCada6 = (array, accio) => {
    const arrFil = array.filter( elem => elem.length > 7);
    return accio(arrFil.reduce((conc, elem) => conc + elem + " ", ""));
}
paraCada6(dies, console.log);