var piezas = [0,1,2,3]
let mensaje = document.getElementById("finalizado")
let botones = document.getElementById("botones")
let nivel2 = document.getElementById("nivel2")
let tabla = document.getElementById("tabla")
let imagen_completa = document.getElementById("imagen-completa")
let tr1 = document.getElementById("tr1")
let tr2 = document.getElementById("tr2")




//variable para destinguir si es el primer o sengundo click
var click = 0

function desordenar() {
    piezas = piezas.sort(() => {return Math.random() -0.5})
    //console.log(piezas)
}

function descartarCasillas() {
    //elimina el borde de todas las casillas
    for(let i=0; i<=3; i++) {
        let cuadro = document.getElementById("imagen"+i)
        cuadro.style.outline = null
    }
}
//esta funcion se le llama cuando se hace click en una casilla
function seleccionar(valor) {
    //contabilizando el click de las casillas (si hizo 1 o 2 clicks)
    click = click + 1
    //console.log("numero de click: "+click)
    if(click == 1) {
        click1 = valor
        descartarCasillas()
        let cuadro = document.getElementById("imagen"+valor)
        cuadro.style.outline = "solid 2px green"
        console.log("casilla del primer click: "+click1)
    }

    if(click == 2) {
        var click2 = valor

        //console.log(piezas)

        //intercambiar los valores en las posiciones del array
        var aux = piezas[click1]
        //cambio el contenido de con los valores donde hizo click
        piezas[click1] = piezas[click2]
        //pongo la casilla del segundo click el contenido que habia en la primera
        piezas[click2] = aux

        //console.log(piezas)

        //pongo el contador de vuelta en 0
        click = 0

        //desmarco todas las casillas marcadas
        descartarCasillas()

        //aca se refresca por cada movimiento del puzzle
        ponerPiezas()
        var correcto = rompecabezasFinalizado()
        if(correcto == true) {
            mensaje.innerHTML = "rompecabezas completo"
            const button = document.createElement("button")
            button.innerHTML="nivel 2"
            nivel2.appendChild(button)
            imagen_completa.style.display='block'
            tr1.style.display='none'
            tr2.style.display='none'
            //document.oncontextmenu = function(){return false}
        }
    }
}

function rompecabezasFinalizado() {
    var correcto = true
    //recorrer todo el array piezas y ver el contenido de cada casilla se corresponde con su posicion 
    for(var i=0; i<=3; i++) {
        if(piezas[i] != i) {
            correcto = false
        }
    }
    return correcto
}

function ponerPiezas() {
    for(let casilla=0; casilla<4; casilla++) {
        //obtengo el numero de la imagen que hay en el array en la casilla  'casilla'
        var imagen = piezas[casilla]
        //pongo la imagen en la casilla seleccionada anteriormente seleccionada
        let cuadro = document.getElementById("imagen"+casilla)
        cuadro.src = "imagenes_nivel1/"+imagen+".png"
    }
}

//llamo a la funcion desordenar
desordenar()
//llamo a la funcion que refresca las imagenes del puzzle
ponerPiezas()