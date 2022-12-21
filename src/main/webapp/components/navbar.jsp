<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="<%= request.getContextPath() %>">Inicio</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%= request.getContextPath() %>/GetAllArticlesController">Mostrar Artículos</a></li>
				<li class="nav-item"><a class="nav-link" href="<%= request.getContextPath() %>/createArticle.jsp">Crear Artículo</a></li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Repositorios </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="https://github.com/hozlucas28/Codo-Codo-Front-end-2022" target="_blank">Front-end</a></li>
						<li><a class="dropdown-item" href="https://github.com/hozlucas28/Codo-Codo-Back-end-2022" target="_blank">Back-end</a></li>
					</ul>
				</li>
			</ul>
			<form class="d-flex" role="search" action="<%= request.getContextPath() %>/SearchArticleController" method="GET">
				<input class="form-control me-2" name="searchKey" type="search" placeholder="Título..." />
				<button class="btn btn-outline-success" type="submit">Buscar</button>
			</form>
		</div>
	</div>
</nav>
