import { StyleSheet, View } from "react-native";
import { useState } from 'react';

export default function App() {
  const [figure, setFigure] = useState([
    { style: styles.circle, color: 'red' },
    { style: styles.circle, color: 'blue' },
    { style: styles.circle, color: 'green'},
    { style: styles.circle, color: 'blue'},
    { style: styles.circle, color: 'green'},
    { style: styles.circle, color: 'red'},
    { style: styles.circle, color: 'green'},
    { style: styles.circle, color: 'red'},
    { style: styles.circle, color: 'blue'},
  ]);

  return (
    <View style={[styles.container, { flexDirection: 'row', flexWrap: 'wrap' }]}>
      {figure.map((elem, index) => (
        <View key={index} style={[elem.style, { backgroundColor: elem.color }]}></View>
      ))}
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
    alignContent: 'center'
  },
  square: {
    width: 100,
    height: 100,
    backgroundColor: 'blue'
  },
  triangle: {
    width: 0,
    height: 0,
    backgroundColor: 'transparent',
    borderLeftWidth: 50,
    borderRightWidth: 50,
    borderBottomWidth: 100,
    borderLeftColor: 'transparent',
    borderRightColor: 'transparent',
    borderBottomColor: 'blue'
  },
  rectangle: {
    width: 200,
    height: 100,
    backgroundColor: 'blue'
  },
  circle: {
    width: 100,
    height: 100,
    borderRadius: 100/2,
    backgroundColor: 'green'
  }
})