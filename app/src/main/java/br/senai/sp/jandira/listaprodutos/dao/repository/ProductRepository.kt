package br.senai.sp.jandira.listaprodutos.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.senai.sp.jandira.listaprodutos.R
import br.senai.sp.jandira.listaprodutos.model.Product

class ProductRepository {

    companion object {
        @Composable
        fun getProductList(): List<Product> {
            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse",
                    price = 29.99,
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 2,
                    name = "Teclado",
                    price = 128.66,
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 3,
                    name = "Mickey Mouse",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 4,
                    name = "Caneca Java",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium",
                    image = painterResource(id = R.drawable.caneca_java)
                ),
                Product(
                    id = 5,
                    name = "Camiseta Javascript",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium",
                    image = painterResource(id = R.drawable.camiseta_js)
                ),
                Product(
                    id = 6,
                    name = "Caneca Javascript",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 7,
                    name = "Caneca Python",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 8,
                    name = "Caneca Node.js",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 9,
                    name = "Caneta Azul",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
                Product(
                    id = 10,
                    name = "Manoel Gomes",
                    description = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium"
                ),
            )
        }
    }
}