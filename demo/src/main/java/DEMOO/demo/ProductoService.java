package DEMOO.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


  @Service
  public class ProductoService {


      @Autowired
      private ProductosRepository productosRepository;

      public List<Productos> getAllProductos() {
          return productosRepository.findAll();
      }

      public Optional<Productos> getProductosById(Long id) {
          return productosRepository.findById(id);
      }

      public Productos saveProducto(Productos productos) {
          return productosRepository.save(productos);
      }

      public void deleteProductos(Long id) {
          productosRepository.deleteById(id);
      }

      public Productos updateProducto(Long id, Productos producto) {
          Optional<Productos> productoExistente = productosRepository.findById(id);
          if (productoExistente.isPresent()) {
              Productos updatedProducto = productoExistente.get();
              updatedProducto.setNombre_p(producto.getNombre_p());
              updatedProducto.setReferencia_p(producto.getReferencia_p());
              updatedProducto.setValor_p(producto.getValor_p());
              updatedProducto.setMes_De_Consumo(producto.getMes_De_Consumo());
              updatedProducto.setFecha_p(producto.getFecha_p());
              return productosRepository.save(updatedProducto);
          } else {
              throw new RuntimeException("Producto no encontrado");
          }
      }
  }

