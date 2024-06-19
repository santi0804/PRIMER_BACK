package DEMOO.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rutageneral")
public class ProductosController {

    @Autowired
    private ProductoService productoService;


    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/productos")                                   // Este empoy me trae todos los productos //
    public ResponseEntity<List<Productos>> getAllProductos() {
        List<Productos> productos = productoService.getAllProductos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/{id}")                                         // este empoy me devuelve un producto con id//
    public ResponseEntity<Productos> getProductoById(@PathVariable(name = "id") Long id) {
        Optional<Productos> productos = productoService.getProductosById(id);
        return new ResponseEntity<>(productos.get(), HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:5173")               // tener presente este campo para integrar cada endpoint //
    @PostMapping("/registro")
    public ResponseEntity<Productos> addProducto(@RequestBody Productos producto) {
        Productos saveProducto = productoService.saveProducto(producto);
        return new ResponseEntity<>(saveProducto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Productos> deleteProducto(@PathVariable Long id) {
        productoService.deleteProductos(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Productos> updateProducto(@PathVariable("id") Long id, @RequestBody Productos producto) {
        try {
            Productos updatedProducto = productoService.updateProducto(id, producto);
            return new ResponseEntity<>(updatedProducto, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
