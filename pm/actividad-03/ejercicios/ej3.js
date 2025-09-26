import { Pressable, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [ square1Color, setSquare1Color ] = useState('yellow');
  const [ square2Color, setSquare2Color ] = useState('yellow');
  const [ squareSize, setSquareSize ] = useState(200);

  function squareOnPress(id) {
    if (id === 1) {
      setSquare1Color('green');
      setSquare2Color('green');
      setSquareSize(squareSize + 20);
    }
    if (id === 2) {
      setSquare1Color('yellow');
      setSquare2Color('yellow');
      setSquareSize(squareSize - 20);
    }
  }

  return (
    <View style={styles.container}>
      <Pressable 
        style={[
          styles.square, 
          {
            backgroundColor: square1Color,
            width: squareSize,
            height: squareSize
          }
        ]}
        onPress={() => squareOnPress(1)}
      />
      <Pressable 
        style={[
          styles.square, 
          {
            backgroundColor: square2Color,
            width: squareSize,
            height: squareSize
          }
        ]}
        onPress={() => squareOnPress(2)}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
  },
  square: {
    marginTop: -6,
    width: 200,
    height: 200,
    backgroundColor: 'yellow',
  },
});
