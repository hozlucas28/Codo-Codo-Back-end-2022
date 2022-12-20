<%@page import="java.util.List"%>
<%@page import="ar.com.codoacodo.domain.Article"%>

<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="UTF-8" />
		<meta name="copyright" content="Lucas Hoz" />
		<meta name="robots" content="index, follow" />
		<meta name="Author" lang="es" content="Lucas Hoz" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<meta name="description" content="Curso de Codo a Codo - Full Stack Java, lado Back-end." />
		<meta name="keywords" content="Codo a Codo - Full Stack Java, Back-end, HTML, Java, MySQL, Listado de artículos" />
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous" />
		<title>Codo a Codo - Java (Listado de artículos)</title>
	</head>
<body>
	<!-- ------------------------- Menú de Navegación -------------------------- -->
	<jsp:include page="./components/navbar.jsp" />

	<!-- ------------------------- Contenido Principal ------------------------- -->
	<main>
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h2 class="mt-4">Listado de Artículos:</h2>
					<table class="table mt-3">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Título</th>
								<th scope="col">Autor</th>
								<th scope="col">Precio</th>
								<th scope="col">Imagen</th>
								<th scope="col">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
							<%
								Float total = 0f;
								List<Article> articles = (List<Article>)request.getAttribute("articles");
								for (Article article : articles) {
									total += article.getPrice();
							%>
							<tr>
								<th scope="row"><%= article.getId() %></th>
								<td><%= article.getTitle() %></td>
								<td><%= article.getAuthor() %></td>
								<td><%= article.getPrice() %></td>
								<td><%= article.getImage() %></td>
								<td>
									<a class="btn btn-info" role="button" href="<%= request.getContextPath() %>/UpdateArticleController?id=<%= article.getId() %>">Actualizar</a>
									<button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal"  onclick="setId(<%= article.getId() %>)">Eliminar</button>
								</td>
							</tr>
							<%
								};
							%>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="2" align="right">Total $</td>
								<td colspan="4"><%= total %></td>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
	</main>
</body>

<!-- -------------------------------- Modal -------------------------------- -->
<div class="modal fade" id="exampleModal" tabindex="-1"	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="<%= request.getContextPath() %>/DeleteArticleController">
			<input type="hidden" name="id" id="id">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">Eliminar Artículo</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div class="modal-body">¿Desea eliminar el artículo?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
					<button type="submit" class="btn btn-danger">Eliminar</button>
				</div>
			</form>
		</div>
	</div>
</div>

<!-- ----------------------------- JavaScript ------------------------------ -->
<script type="text/javascript">
	function setId(id) {
		document.getElementById('id').value=id;
	}
</script>

<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</html>
