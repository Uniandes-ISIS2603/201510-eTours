(function () {
	var mainApp = angular.module('mainApp', ['ngRoute', 'noticiaModule', 'calificacionesModule', 'eventoModule']);
                           
                        
	mainApp.config(['$routeProvider', function ($routeProvider) { 
                        $routeProvider.when('/noticia', {
<<<<<<< Updated upstream
<<<<<<< HEAD
				templateUrl: 'src/modules/noticia/noticia.tpl.html'
			             });
=======
				templateUrl: '../src/modules/evento/evento.tpl.html'
			}).otherwise('/');
=======
				templateUrl: '../src/modules/noticia/noticia.tpl.html'
			});
>>>>>>> Stashed changes
                        
                        $routeProvider.when('/hotel', {
				templateUrl: 'src/modules/hotel/hotel.tpl.html'
                        });
        
>>>>>>> FETCH_HEAD
                           $routeProvider.when('/paquete', {
				templateUrl: '..src/modules/paquete/paquete.tpl.html'
                        });
                        $routeProvider.when('/evento', {
				templateUrl: '../src/modules/evento/evento.tpl.html'
                        }).otherwise('/');
                        
		}]);            
<<<<<<< HEAD
            //Configuración módulo noticia
	var noticiaModule = angular.module('noticiaModule', ['CrudModule', 'MockModule']);
=======
            
      
        //EJEMPLO Configuración módulo calificaciones
	var calificacionesModule = angular.module('calificacionesModule', ['CrudModule', 'MockModule']);

	calificacionesModule.constant('calificaciones.context', 'calificaciones');

	calificacionesModule.config(['calificaciones.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            
>>>>>>> FETCH_HEAD

          var noticiaModule = angular.module('noticiaModule', ['CrudModule', 'MockModule']);

	noticiaModule.constant('noticia.context', 'noticia');

	noticiaModule.config(['noticia.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);  
  //Configuración módulo paquete
	var paqueteModule = angular.module('paqueteModule', ['CrudModule', 'MockModule']);

	paqueteModule.constant('paquete.context', 'paquete');

	paqueteModule.config(['paquete.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
})();