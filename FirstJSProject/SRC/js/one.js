
function limitText(){
    'use strict'
    var limitedText;
    var originalText = document.getElementById('username').value;
    var lastSpace = originalText.LastIndexOf(' ',5);
    limitedText=originalText.slice(0,lastSpace);
    document.getElementById('outputbox').value=limitedText;
    return false;
    }
    function init(){
    'use strict'
    document.getElementBy.Id('calcForm').submit = limitText;
    }
    window.onload = init;
