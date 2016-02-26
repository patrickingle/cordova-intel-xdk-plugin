var cordova = require('cordova');

function Echo(str, callback) {
	cordova.exec(callback, function(err) {
            callback('Nothing to echo.');
    }, "Echo", "echo", [str]);
}


module.exports = new Echo();