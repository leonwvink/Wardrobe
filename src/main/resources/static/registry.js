
function getWardrobe(){
$.get("/api/wardrobe/", function(data){
    if (data.length <= 0) {
    return;
    }

    var html = "";

    for (var i=0; i<data.length; i++){
        html += "<p>" + data[i] + "</p>";
    }

    $("#log").html(html);
});
}


function saveName(e){
    e.preventDefault();
    var name = $("#name").val();
    $.get("/api/wardrobe/" + name, function() {
    getWardrobe();
    });
}

function saveName(e) {
    e.preventDefault();
    var name1 = $("#name").val();

    $.post("api/wardrobe/add",
    {
    name: name1
    },
    function() {
    getWardrobe();
    } );
}

function open(){

    $.get("/api/wardrobe/open", function() {
    getWardrobe();
    });
}

function close(){

    $.get("/api/wardrobe/close", function() {
    getWardrobe();
    });
}

function getIn(){

    $.get("/api/wardrobe/getin", function() {
    getWardrobe();
    });
}

function getOut(){

    $.get("/api/wardrobe/getout", function() {
    getWardrobe();
    });
}

function kick(){

    $.get("/api/wardrobe/kick", function() {
    getWardrobe();
    });
}


$("#add").click(saveName);
$("#open").click(open);
$("#close").click(close);
$("#getIn").click(getIn);
$("#getOut").click(getOut);
$("#kick").click(kick);
getWardrobe();