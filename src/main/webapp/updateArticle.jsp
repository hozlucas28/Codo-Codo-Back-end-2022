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
		<meta name="keywords" content="Codo a Codo - Full Stack Java, Back-end, HTML, Java, MySQL, Actualizar art�culo" />
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous" />
		<title>Codo a Codo - Java (Actualizar art�culo)</title>
	</head>
	<body>
		<!-- ------------------------- Menú de Navegación -------------------------- -->
		<jsp:include page="./components/navbar.jsp" />

		<!-- ------------------------- Contenido Principal ------------------------- -->
		<main>
			<% Article article = (Article)request.getAttribute("article"); %>
			<div class="container">
				<div class="row">
					<div class="col-12">
						<h2 class="mt-4">Crear Art�culo:</h2>
						<form class="mt-3 row g-3 needs-validation" action="<%= request.getContextPath() %>/UpdateArticleController?id=<%= article.getId() %>" method="POST" novalidate>
							<div class="col-md-4">
								<label for="validationCustom01" class="form-label">Título</label>
								<input name="title" type="text" class="form-control" id="validationCustom01" value="<%= article.getTitle() %>" required />
							</div>
							<div class="col-md-4">
								<label for="validationCustom02" class="form-label">Autor</label>
								<input name="author" type="text" class="form-control" id="validationCustom02" value="<%= article.getAuthor() %>" required />
							</div>
							<div class="col-md-4">
								<label for="validationCustomUsername" class="form-label">Precio</label>
								<div class="input-group has-validation">
									<input name="price" type="number" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" value="<%= article.getPrice() %>" required />
								</div>
							</div>
							<div class="col-md-6">
								<label for="validationCustom03" class="form-label">Imagen</label>
								<input name="image" type="file" class="form-control" id="validationCustom03" value="<%= article.getImage() %>" required />
							</div>
							<div class="col-12">
								<button class="btn btn-primary" type="submit">Actualizar</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</main>
	</body>
	<!-- ----------------------------- JavaScript ------------------------------ -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</html>
