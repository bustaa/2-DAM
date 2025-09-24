//A partir d'un array de numeros, mostra la suma de tots ells
let array1 = [1, 2, 3, 4, 5, 6, 7, 8, 9];

const resArray1 = array1.reduce((acc, elem) => acc + elem, 0);

console.log(resArray1);

//45

//A partir d'un array d'strings i numeros, mostra un string que els continga tots
let array2 = ['a', 1, 'b', 2, 'c', 3];

const resArray2 = array2.reduce((acc, elem) => acc + elem, "");

console.log(resArray2);

// a1b2c3

// A partir d'un array de dies, em torne un OBJECTE amb tants atributs com dies i la posició de cada dia
// És a dir per a l'array ['dilluns', 'dimarts', 'dimecres'] 
// torne un objecte {dilluns:0, dimarts:1, dimecres:2}
let dies = ['dilluns', 'dimarts', 'dimecres'];

const resDies = dies.reduce((obj, elem, pos) => {
    obj[elem] = pos;
    return obj;
}, {});

console.log(resDies);

//A partir d'un array amb objectes Musics (nom i instrument que toca)
//Que torne un array amb els noms de tots els components
// [ 'Joan', 'Pep', 'Vicent Lloret', 'Ariadna', 'Guillem' ]
let musics = [
    {'nom': 'Joan', 'instrument': 'vocal'},
    {'nom': 'Pep', 'instrument': 'guitarra'},
    {'nom': 'Vicent Lloret', 'instrument': 'guitarra'},
    {'nom': 'Ariadna', 'instrument': 'bateria'},
    {'nom': 'Guillem', 'instrument': 'baix'}
]

const resMusics = musics.map(elem => elem.nom);

console.log(resMusics);

//Ara feu-ho utilitzant map()

//Ara que torne un array només amb els noms del musics que toquen la guitarra
//['Pep', 'Vicent Lloret']

const resMusic2 = musics.filter(elem => elem.instrument === 'guitarra');

const resTotalMusic2 = resMusic2.map(elem => elem.nom);

console.log(resTotalMusic2);

//Amb reduce

const resMusics3 = musics.reduce((acc, elem) => {
    if (elem.instrument === 'guitarra') acc.push(elem.nom);
    return acc;
},[]);

console.log(resMusics3);

//['Pep', 'Vicent Lloret']
//----------------------------------------------------------------------------------

const users = [
    {
        id: 1,
        name: "Jonathon Haley",
        username: "Monte.Weber2",
        email: "Daphne43@yahoo.com",
        phone: "1-563-675-1857 x11708",
        website: "carmela.net",
        password: "hashed_password"
    },
    {
        id: 2,
        name: "Dean John",
        username: "dd.1",
        email: "deno@google.com",
        phone: "1-123-543-1857 123212",
        website: "dd.net",
        password: "Dean_hashed_password"
    }]

const resUsers = users.map(({ email, website, phone }) => ({ email, website, phone}))

console.log(resUsers);

    //Que torne un array d'objectes amb l'email, el tel i la web
[
    {
        email: 'Daphne43@yahoo.com',
        website: 'carmela.net',
        phone: '1-563-675-1857 x11708'
    },
    {
        email: 'deno@google.com',
        website: 'dd.net',
        phone: '1-123-543-1857 123212'
    }
]


//-----------------------------------------------------
//A partir d'un arrar de comandes com el proporcionat
let comandes = [
    {
        client: {
            nom: "Manel Viel"
        },
        productes: [
            {
                id: 1,
                nom: "Taronges"
            }, {
                id: 2,
                nom: "Pomes"
            }
        ]
    }, {
        client: {
            nom: "Joan Mi"
        },
        productes: [
            {
                id: 3,
                nom: "Peres"
            }, {
                id: 2,
                nom: "Pomes"
            }
        ]
    }, {
        client: {
            nom: "Tomas Marin"
        },
        productes: [
            {
                id: 4,
                nom: "Freses"
            }, {
                id: 2,
                nom: "Peres"
            }, {
                id: 1,
                nom: "Platans"
            }
        ]
    }
]

// tornar un array anomenat llistat de comandes, on cada element siga un array d'objectes on 
// aparega només el client i el producte de la seua comanda.
// Exemple:

//llistatDeComandes => [
//    [
//        { client: 'Manel Viel', productes: 'Taronges' },
//        { client: 'Manel Viel', productes: 'Pomes' }
//    ],
//    [
//        { client: 'Joan Mi', productes: 'Peres' },
//         { client: 'Joan Mi', productes: 'Pomes' }
//     ],
//     [
//         { client: 'Tomas Marin', productes: 'Freses' },
//         { client: 'Tomas Marin', productes: 'Peres' },
//         { client: 'Tomas Marin', productes: 'Platans' }
//     ]
// ]

let resComandes = comandes.map(comanda => {
    return comanda.productes.map(producte => { return {client: comanda.client.nom, productes: producte.nom}})
})

console.log(resComandes);

